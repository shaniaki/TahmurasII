
% Note: Requires the definition of the following parameters:
%% int: max_steps as the maximum simulation time as steps

% Helper predicates
%% Returns a clock configuration, i.e., number of instants so far until each step (tested)
function array [steps_range] of var int: clk_conf(
        array [steps_range] of var bool: c
    ) :: promise_total = let {
        array [steps_range] of var int: c_conf;
        constraint c_conf[1] = c[1]; % FIXME: does this makes it partial?
        constraint forall (i in 2..max_steps) (
            (c_conf[i] = c_conf[i-1] + c[i]) %/\
%             (c[i] = (c_conf[i] != c_conf[i-1]))            
        )
    } in c_conf
;

%% 2 to the power of
function var int : pow2(var int:x)
    = let {
        var int: y;
        constraint exists(i in lb(x)..ub(x)) (
            i = x /\
            pow(2,i) = y
        );
        constraint y >= 0;
    } in y
;

predicate pow2(var int:y, var int:x) =
      exists(i in lb(x)..ub(x)) (
         i = x /\
         pow(2,i) = y
      )
;

% Definitions

%% Custom ranges, types, etc.
set of int: steps_range = 1..max_steps;
% set of int: ibool = 0..1;

% Clock relations
%% Coincedence (tested)
predicate Coincides(array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) =
    forall (i in steps_range) (c2[i]=c1[i])
;

%% Subclocking (tested)
predicate SubClock(array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) =
    forall (i in steps_range) (c1[i] -> c2[i])
;

%% Exclusion (tested)
predicate Exclusion(array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) =
    forall (i in steps_range) ((c1[i] /\ c2[i]) = false)
;

%% Strict precedence (tested)
predicate Precedes(array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) = let {
        array[steps_range] of var int: c1_conf;
        array[steps_range] of var int: c2_conf;
        constraint c1_conf = clk_conf(c1);
        constraint c2_conf = clk_conf(c2);
    } in
    c2[1]=false /\
    forall (i in 1..max_steps-1) (
        (c1_conf[i]>=c2_conf[i]) /\ (c1_conf[i]=c2_conf[i] -> c2[i+1]=false)
    )
;

%% Precedence (tested)
predicate NonStrictPrecedes(array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) = let {
        array[steps_range] of var int: c1_conf;
        array[steps_range] of var int: c2_conf;
        constraint c1_conf = clk_conf(c1);
        constraint c2_conf = clk_conf(c2);
    } in
    forall (i in steps_range) (c1_conf[i]>=c2_conf[i])
;
% predicate NonStrictPrecedes(array[steps_range] of var bool: c1,
%         array[steps_range] of var bool: c2
%     ) = let {
%         array[steps_range] of var int: c1_conf;
%         array[steps_range] of var int: c2_conf;
%         constraint c1_conf = clk_conf(c1);
%         constraint c2_conf = clk_conf(c2);
%     } in
%     c2[1] -> c1[1] /\
%     forall (i in 1..max_steps-1) (
%         (c1_conf[i]>=c2_conf[i]) /\ (c1_conf[i]=c2_conf[i] -> (c2[i+1] -> c1[i+1]))
%     )
% ;

% Clock Expressions
%% Union (tested)
function array[steps_range] of var bool: Union(
        array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        constraint forall (i in steps_range) (
            c[i] = (c1[i] \/ c2[i])
        );
    } in c
;

%% Intersection (tested)
function array[steps_range] of var bool: Intersection(
        array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        constraint forall (i in steps_range) (
            c[i] = (c1[i] /\ c2[i])
        );
    } in c
;

%% Infimum (tested)
function array[steps_range] of var bool: Inf(
        array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        array[steps_range] of var int: c2_conf;
        constraint c_conf = clk_conf(c);
        constraint c1_conf = clk_conf(c1);
        constraint c2_conf = clk_conf(c2);
        constraint forall (i in steps_range) (
            c_conf[i] = max(c1_conf[i],c2_conf[i])
        );
    } in c
;

%% Supremum (tested)
function array[steps_range] of var bool: Sup(
        array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        array[steps_range] of var int: c2_conf;
        constraint c_conf = clk_conf(c);
        constraint c1_conf = clk_conf(c1);
        constraint c2_conf = clk_conf(c2);
        constraint forall (i in steps_range) (
            c_conf[i] = min(c1_conf[i],c2_conf[i])
        );
    } in c
;

%% Sampling (c = c1 sampledOn c2)(tested)
function array[steps_range] of var bool: NonStrictSampledOn(
        array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[0..max_steps] of var bool: c1_seen;
        constraint c1_seen[0]=false;
        constraint forall (i in steps_range) (
            (c1_seen[i] = ((c1[i] \/ c1_seen[i-1]) /\ not c[i])) /\
            (c[i] = (c2[i] /\ (c1_seen[i-1] \/ c1[i])))
        );
    } in c
;

%% Strict sampling (c = c1 strictlySampledOn c2)(tested)
function array[steps_range] of var bool: SampledOn(
        array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[0..max_steps] of var bool: c1_seen;
        constraint c1_seen[0]=false;
        constraint forall (i in steps_range) (
            (c1_seen[i] = ((c1[i] \/ c1_seen[i-1]) /\ not c[i])) /\
            (c[i] = (c2[i] /\ c1_seen[i-1]))
        );
    } in c
;

%% Await (tested)

function array[steps_range] of var bool: Wait(
        array[steps_range] of var bool: c1,
        var int: n
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        constraint c_conf = clk_conf(c);
        constraint c1_conf = clk_conf(c1);
        constraint forall (i in steps_range) (
            c_conf[i] = min(c1_conf[i],n)
        );
    } in c
;

% %% Defering (c1 defered for <ns>) while ns has indices 1.. and domain 0.. (tested)
% predicate defered(array[steps_range] of var bool: c,
%         array[steps_range] of var bool: c1,
%         array[steps_range] of var int: c1_conf,
%         array[int] of var int: ns
%     ) =
%     forall (j in steps_range) (
%         c1[j]=1 /\ j+ns[c1_conf[j]] in index_set(c) -> c[j+ns[c1_conf[j]]]=1 
%     )
% ;

% %% Defering On (c1 defered c2 for <ns>) while ns has indices 1.. and domain 0.. (difficult, ns doesn't work) (buggy see delayOn)
% predicate deferedOn(array[steps_range] of var bool: c,
%         array[steps_range] of var bool: c1,
%         array[steps_range] of var bool: c2,
%         array[int] of var int: ns
%     ) =
%     let {array[0..max_steps,steps_range] of var bool: bws} in
%     % manipulate the binary word
%     forall (i in steps_range) (bws[0,i]=0) /\
%     forall (i in steps_range) (
%         (c[i] = bws[i-1,1] * c2[i]) /\
%         (c1[i]=1 -> bws[i,2]=1) /\ 
%         bws[i,max_steps]=0 /\
%         forall (j in 1..max_steps-1) (
%             (c2[i]=1 -> (j!=2/\c1[i]!=1 -> bws[i,j]=bws[i-1,j+1])) /\
%             (c2[i]=0 -> (j!=2/\c1[i]!=1 -> bws[i,j]=bws[i-1,j]))
%         )
%     )
% ;

%% Upto (tested)
function array[steps_range] of var bool: UpTo(
        array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c2_conf;
        constraint c2_conf = clk_conf(c2);
        constraint forall (i in steps_range) (
            c[i] = (c2_conf[i]=0)/\c1[i]
        );
    } in c
;

% %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%% Delay (a special case of filteredBy) (tested) FIXME: is this total?
function array[steps_range] of var bool: Delay(
        array[steps_range] of var bool: c1,
        var int: d
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        constraint c_conf = clk_conf(c);
        constraint c1_conf = clk_conf(c1);
        constraint forall (i in steps_range) (
            c_conf[i] = max(c1_conf[i]-d,0)
        );
    } in c
;

%% Bounded precedence (tested)
predicate BoundedPrecedes(array[steps_range] of var bool: c1,
        array[steps_range] of var bool: c2,
        var int: d
    ) =
    Precedes(c1,c2) /\ Precedes(c2,Delay(c1,d))
;

%% Delay On (a special case of filteredBy) (not efficient?) (d>0)
function array[steps_range] of var bool: DelayFor(
        array[steps_range] of var bool: c1,
        var int: d,
        array[steps_range] of var bool: base
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        % binary word encoded as an integer
        array[1..max_steps+1] of var 0..pow(2,max_steps)-1: bws;
        var int: d2 = pow2(d-1);
        constraint bws[1]=0;
        constraint forall (i in steps_range) (
            (c[i] = (bws[i] mod 2) * base[i]) /\
%             (not c1[i]/\not base[i] -> bws[i+1]=bws[i]           ) /\
%             (not c1[i]/\base[i]     -> bws[i+1]=bws[i] div 2     ) /\
%             (c1[i]    /\not base[i] -> bws[i+1]=bws[i] + d2      ) /\
%             (c1[i]    /\base[i]     -> bws[i+1]=bws[i] div 2 + d2)
            % The above 4 lines are encrypted as:
            (bws[i+1] = bws[i] div (1+base[i]) + c1[i]*d2)
        );
    } in c
;

%% Packet first (a special case of filteredBy) (tested)
function array[steps_range] of var bool: PacketFirst(
        array[steps_range] of var bool: c1,
        var int: period
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c_conf = clk_conf(c);
        array[steps_range] of var int: c1_conf = clk_conf(c1);
        constraint forall (i in steps_range) (
            c_conf[i] = (c1_conf[i]+period-1) div period
            % The following does not work when c1_conf[i]=0 :
            % c_conf[i] = (c1_conf[i]-1) div period + 1
        );
    } in c
;

%% byLast (a special case of filteredBy)
function array[steps_range] of var bool: PacketLast(
        array[steps_range] of var bool: c1,
        var int: period
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c_conf = clk_conf(c);
        array[steps_range] of var int: c1_conf = clk_conf(c1);
        constraint forall (i in steps_range) (
            c_conf[i] = (c1_conf[i]) div period
        );
    } in c
;

%% isPeriodicOn (a special case of filteredBy)
function array[steps_range] of var bool: Periodic(
        array[steps_range] of var bool: c1,
        var int: period,
        var int: offset
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c_conf = clk_conf(c);
        array[steps_range] of var int: c1_conf = clk_conf(c1);
        constraint forall (i in steps_range) (
            c_conf[i] = max(c1_conf[i]+period-1-offset,0) div period
        );
    } in c
;

% filteredBy (tested)
function array[steps_range] of var bool: FilterBy(
    array[steps_range] of var bool: c1,
    array[int] of var bool: transient,
    array[int] of var bool: periodic
    ) :: promise_total = let {
        array[steps_range] of var bool: c;
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        constraint c_conf = clk_conf(c);
        constraint c1_conf = clk_conf(c1);
        int: tran_len = length(transient);
        int: peri_len = length(periodic);
        % first construct the filtering sequence
        array[steps_range] of var bool: seq;
        array[0..max_steps] of var int: seq_conf;
        constraint forall (i in 0..max_steps) (
                if i=0 then seq_conf[i]=0 else seq_conf[i]=clk_conf(seq)[i] endif
        ); % seq_conf = [0] ++ clk_conf(seq);
        constraint forall (i in steps_range) (
            if i<=tran_len then seq[i]=transient[i] else
            seq[i]=periodic[(i-tran_len-1) mod peri_len + 1] endif
        );
        % then use its configuration as a look up table by means of the clock configuration
        % or: how many ticks (1's in seq) the clock should have made until now?
        constraint forall (i in steps_range) (
            c_conf[i] = seq_conf[c1_conf[i]]
        );
    } in c
;

