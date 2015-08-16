
% Note: Requires the definition of the following parameters:
%% int: max_steps as the maximum simulation time as steps
%% int: num_clks as the number of clocks present in the system

% Helper predicates
% Returns a clock configuration, i.e., number of instants so far until each step (tested)
function array [steps_range] of var int: clk_conf(
        array [steps_range] of var set of clk_range: run,
        clk_range: c
    ) = let {
        array [steps_range] of var int: c_conf;
        constraint c_conf[1] = bool2int(c in run[1]);
        constraint forall (i in 2..max_steps) (
            (c_conf[i] = c_conf[i-1] + bool2int(c in run[i]))
        )
    } in c_conf
;

predicate extract_clk(array[steps_range] of var set of clk_range: run,
        clk_range: c_idx,
        array[steps_range] of var bool: c
    ) =
    forall (i in steps_range) ( c[i] <-> (c_idx in run[i]))
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
set of int: clk_range = 1..num_clks;

% Clock relations
%% Coincedence (tested)
predicate Coincides(array[steps_range] of var set of clk_range: run,
        clk_range: c1,
        clk_range: c2
    ) =
    forall (i in steps_range) (
      c1 in run[i] <-> c2 in run[i]
    )
;

%% Subclocking (tested)
predicate SubClock(array[steps_range] of var set of clk_range: run,
        clk_range: c1,
        clk_range: c2
    ) =
    forall (i in steps_range) (
      c1 in run[i] -> c2 in run[i]
    )
;

%% Exclusion (tested)
predicate Exclusion(array[steps_range] of var set of clk_range: run,
        clk_range: c1,
        clk_range: c2
    ) =
    forall (i in steps_range) (
        not ((c1 in run[i]) /\ (c2 in run[i]))
    )
;

%% Strict precedence (tested)
predicate Precedes(array[steps_range] of var set of clk_range: run,
        clk_range: c1,
        clk_range: c2
    ) = let {
        array[steps_range] of var int: delta;
        constraint delta[1] = 0;
        constraint forall (i in 2..max_steps) (
            (delta[i] = delta[i-1] + bool2int(c1 in run[i-1])-bool2int(c2 in run[i-1]))
        );
    } in
    forall (i in 1..max_steps) (
        delta[i]>=0 /\ (delta[i]=0 -> not (c2 in run[i]))
    )
;

%% Precedence (tested)
predicate NonStrictPrecedes(array[steps_range] of var set of clk_range: run,
        clk_range: c1,
        clk_range: c2
    ) = let {
        array[steps_range] of var int: delta;
        constraint delta[1] = 0;
        constraint forall (i in 2..max_steps) (
            (delta[i] = delta[i-1] + bool2int(c1 in run[i-1])-bool2int(c2 in run[i-1]))
        );
    } in
    forall (i in 1..max_steps) (
        delta[i]>=0 /\ 
        (delta[i]=0 -> (c2 in run[i] -> c1 in run[i]))
    )
;
% % predicate NonStrictPrecedes(array[steps_range] of var bool: c1,
% %         array[steps_range] of var bool: c2
% %     ) = let {
% %         array[steps_range] of var int: c1_conf;
% %         array[steps_range] of var int: c2_conf;
% %         constraint c1_conf = clk_conf(c1);
% %         constraint c2_conf = clk_conf(c2);
% %     } in
% %     c2[1] -> c1[1] /\
% %     forall (i in 1..max_steps-1) (
% %         (c1_conf[i]>=c2_conf[i]) /\ (c1_conf[i]=c2_conf[i] -> (c2[i+1] -> c1[i+1]))
% %     )
% % ;

% Clock Expressions
%% Union (tested)
predicate Union(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        clk_range: c2
    ) = forall (i in steps_range) (
            ((c1 in run[i]) \/ (c2 in run[i])) <-> (c in run[i])
        )
;

%% Intersection (tested)
predicate Intersection(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        clk_range: c2
    ) = forall (i in steps_range) (
            ((c1 in run[i]) /\ (c2 in run[i])) <-> (c in run[i])
        )
;

%% Infimum (tested)
predicate Inf(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        clk_range: c2
    ) = let {
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        array[steps_range] of var int: c2_conf;
        constraint c_conf = clk_conf(run,c);
        constraint c1_conf = clk_conf(run,c1);
        constraint c2_conf = clk_conf(run,c2);
    } in
        forall (i in steps_range) (
            c_conf[i] = max(c1_conf[i],c2_conf[i])
        )
;

%% Supremum (tested)
predicate Sup(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        clk_range: c2
    ) = let {
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        array[steps_range] of var int: c2_conf;
        constraint c_conf = clk_conf(run,c);
        constraint c1_conf = clk_conf(run,c1);
        constraint c2_conf = clk_conf(run,c2);
    } in
        forall (i in steps_range) (
            c_conf[i] = min(c1_conf[i],c2_conf[i])
        )
;

%% Sampling (c = c1 sampledOn c2)(tested)
predicate NonStrictSampledOn(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        clk_range: c2
    ) = let {
        array[0..max_steps] of var bool: c1_seen;
        constraint c1_seen[0]=false;
    } in
        forall (i in steps_range) (
            (c1_seen[i] = (((c1 in run[i]) \/ c1_seen[i-1]) /\ not (c in run[i]))) /\
            (c in run[i] = ((c2 in run[i]) /\ (c1_seen[i-1] \/ (c1 in run[i]))))
        )
;

%% Strict sampling (c = c1 strictlySampledOn c2)(tested)
predicate SampledOn(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        clk_range: c2
    ) = let {
        array[0..max_steps] of var bool: c1_seen;
        constraint c1_seen[0]=false;
    } in
        forall (i in steps_range) (
            (c1_seen[i] = (((c1 in run[i]) \/ c1_seen[i-1]) /\ not (c in run[i]))) /\
            (c in run[i] = ((c2 in run[i]) /\ c1_seen[i-1]))
        )
;

% %% Await (tested)

predicate Wait(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        var int: n
    ) = let {
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        constraint c_conf = clk_conf(run,c);
        constraint c1_conf = clk_conf(run,c1);
    } in 
        forall (i in steps_range) (
            c_conf[i] = min(c1_conf[i],n)
        )
;

% % %% Defering (c1 defered for <ns>) while ns has indices 1.. and domain 0.. (tested)
% % predicate defered(array[steps_range] of var bool: c,
% %         array[steps_range] of var bool: c1,
% %         array[steps_range] of var int: c1_conf,
% %         array[int] of var int: ns
% %     ) =
% %     forall (j in steps_range) (
% %         c1[j]=1 /\ j+ns[c1_conf[j]] in index_set(c) -> c[j+ns[c1_conf[j]]]=1 
% %     )
% % ;

% % %% Defering On (c1 defered c2 for <ns>) while ns has indices 1.. and domain 0.. (difficult, ns doesn't work) (buggy see delayOn)
% % predicate deferedOn(array[steps_range] of var bool: c,
% %         array[steps_range] of var bool: c1,
% %         array[steps_range] of var bool: c2,
% %         array[int] of var int: ns
% %     ) =
% %     let {array[0..max_steps,steps_range] of var bool: bws} in
% %     % manipulate the binary word
% %     forall (i in steps_range) (bws[0,i]=0) /\
% %     forall (i in steps_range) (
% %         (c[i] = bws[i-1,1] * c2[i]) /\
% %         (c1[i]=1 -> bws[i,2]=1) /\ 
% %         bws[i,max_steps]=0 /\
% %         forall (j in 1..max_steps-1) (
% %             (c2[i]=1 -> (j!=2/\c1[i]!=1 -> bws[i,j]=bws[i-1,j+1])) /\
% %             (c2[i]=0 -> (j!=2/\c1[i]!=1 -> bws[i,j]=bws[i-1,j]))
% %         )
% %     )
% % ;

%% Upto (tested)
predicate UpTo(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        clk_range: c2
    ) = let {
        array[steps_range] of var int: c2_conf;
        constraint c2_conf = clk_conf(run,c2);
    } in
        forall (i in steps_range) (
            (c in run[i]) <-> (c2_conf[i]=0) /\ (c1 in run[i])
        )
;

% % %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%% Delay (a special case of filteredBy) (tested) FIXME: is this total?
predicate Delay(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        var int: d
    ) = let {
        array[steps_range] of var int: c_conf;
        array[steps_range] of var int: c1_conf;
        constraint c_conf = clk_conf(run,c);
        constraint c1_conf = clk_conf(run,c1);
    } in
        forall (i in steps_range) (
            c_conf[i] = max(c1_conf[i]-d,0)
        )
;

%% Bounded precedence (tested)
predicate BoundedPrecedes(array[steps_range] of var set of clk_range: run,
        clk_range: c1,
        clk_range: c2,
        clk_range: aux_clk,
        var int: d
    ) =
    Delay(run,aux_clk,c1,d) /\
    Precedes(run,c1,c2) /\ Precedes(run,c2,aux_clk)
;

%% Delay On (a special case of filteredBy) (not efficient?) (d>0)
predicate DelayFor(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        var int: d,
        clk_range: base
    ) = let {
        % binary word encoded as an integer
        array[1..max_steps+1] of var 0..pow(2,max_steps)-1: bws;
        var int: d2 = pow2(d-1);
    } in
        (bws[1]=0) /\
        (forall (i in steps_range) (
            ((c in run[i]) <-> (bws[i] mod 2 = 1) /\ (base in run[i])) /\
%             (not c1[i]/\not base[i] -> bws[i+1]=bws[i]           ) /\
%             (not c1[i]/\base[i]     -> bws[i+1]=bws[i] div 2     ) /\
%             (c1[i]    /\not base[i] -> bws[i+1]=bws[i] + d2      ) /\
%             (c1[i]    /\base[i]     -> bws[i+1]=bws[i] div 2 + d2)
            % The above 4 lines are encrypted as:
            (bws[i+1] = bws[i] div (1+bool2int(base in run[i])) + bool2int(c1 in run[i])*d2)
        ))
;

%% Packet first (a special case of filteredBy)
predicate PacketFirst(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        var int: period
    ) = let {
        array[steps_range] of var int: c_conf = clk_conf(run,c);
        array[steps_range] of var int: c1_conf = clk_conf(run,c1);
    } in
        forall (i in steps_range) (
            c_conf[i] = (c1_conf[i]+period-1) div period
            % The following does not work when c1_conf[i]=0 :
            % c_conf[i] = (c1_conf[i]-1) div period + 1
        )
;

%% byLast (a special case of filteredBy)
predicate PacketLast(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        var int: period
    ) = let {
        array[steps_range] of var int: c_conf = clk_conf(run,c);
        array[steps_range] of var int: c1_conf = clk_conf(run,c1);
    } in
        forall (i in steps_range) (
            c_conf[i] = (c1_conf[i]) div period
        )
;

%% isPeriodicOn (a special case of filteredBy)
predicate Periodic(array[steps_range] of var set of clk_range: run,
        clk_range: c,
        clk_range: c1,
        var int: period,
        var int: offset
    ) = let {
        array[steps_range] of var int: c_conf = clk_conf(run,c);
        array[steps_range] of var int: c1_conf = clk_conf(run,c1);
    } in
        forall (i in steps_range) (
            c_conf[i] = max(c1_conf[i]+period-1-offset,0) div period
        )
;

% % filteredBy (tested)
% predicate FilterBy(array[steps_range] of var set of clk_range: run,
%         clk_range: c1,
%         array[int] of var bool: transient,
%         array[int] of var bool: periodic
%     ) = let {
%         array[steps_range] of var int: c_conf;
%         array[steps_range] of var int: c1_conf;
%         constraint c_conf = clk_conf(run,c);
%         constraint c1_conf = clk_conf(run,c1);
%         int: tran_len = length(transient);
%         int: peri_len = length(periodic);
%         % first construct the filtering sequence
%         array[steps_range] of var bool: seq;
%         array[0..max_steps] of var int: seq_conf;
%         constraint forall (i in 0..max_steps) (
%                 if i=0 then seq_conf[i]=0 else seq_conf[i]=clk_conf(seq)[i] endif
%         ); % seq_conf = [0] ++ clk_conf(seq);
%         constraint forall (i in steps_range) (
%             if i<=tran_len then seq[i]=transient[i] else
%             seq[i]=periodic[(i-tran_len-1) mod peri_len + 1] endif
%         );
%     } in
%         % then use its configuration as a look up table by means of the clock configuration
%         % or: how many ticks (1's in seq) the clock should have made until now?
%         forall (i in steps_range) (
%             c_conf[i] = seq_conf[c1_conf[i]]
%         )
% ;

