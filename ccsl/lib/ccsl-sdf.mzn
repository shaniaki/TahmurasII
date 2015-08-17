include "ccsl.mzn";

% SDF MoC
%% A token cannot be read before it has been written
predicate sdf_token(array[steps_range] of var set of clk_range: run,
        clk_range: write,
        clk_range: read,
        clk_range: read_delay,
        var int: d
    ) =
    Delay(run,read_delay,read,d) /\
    Precedes(run,write,read_delay)
;

%% Inputs need to be read before actor firing (needs extension to SDF)
predicate sdf_input(array[steps_range] of var set of clk_range: run,
        clk_range: actor,
        clk_range: read,
        clk_range: read_packed,
        int: weight
    ) =
    PacketLast(run,read_packed,read,weight) /\
    Precedes(run,read_packed,actor)
;

%% Outputs are written upon actor firing (needs extension to SDF)
predicate sdf_output(array[steps_range] of var set of clk_range: run,
        clk_range: actor,
        clk_range: write,
        clk_range: write_packed,
        int: weight
    ) =
    PacketFirst(run,write_packed,write,weight) /\
    Coincides(run,actor,write_packed)
;

%% All the constraints implied by an SDF Arc (needs extension to SDF)
predicate sdf_arc(array[steps_range] of var set of clk_range: run,
        clk_range: source,
        clk_range: target,
        clk_range: write,
        clk_range: read,
        clk_range: bp_write,
        clk_range: bp_read,
        clk_range: aux_clk1,
        clk_range: aux_clk2,
        clk_range: aux_clk3,
        clk_range: aux_clk4,
        clk_range: aux_clk5,
        clk_range: aux_clk6,
        int: out_weight,
        int: in_weight,
        var int: d,
        var int: buffer_size
    ) =
    % buffer size should hold at least the initial tokens
    buffer_size >= d /\ buffer_size >= out_weight /\
    % These 3 are the main constraints
    sdf_output(run,source,write,aux_clk3,out_weight) /\
    sdf_token(run,write,read,aux_clk1,d) /\
    sdf_input(run,target,read,aux_clk4,in_weight)% /\
    % and these model the limited buffer size
%     sdf_output(run,target,bp_write,aux_clk5,in_weight) /\
%     sdf_token(run,bp_write,bp_read,aux_clk2,buffer_size) /\
%     sdf_input(run,source,bp_read,aux_clk6,out_weight)
%     Delay(bp_write,bp_write_conf,buffer_size) /\
%     NonStrictPrecedes(bp_write_conf,read_conf)
;

% Constraints regarding the execution of an actor
predicate sdf_actor(array[steps_range] of var set of clk_range: run,
        clk_range: start_clk,
        clk_range: end_clk,
        clk_range: mapped_clk,
        clk_range: aux_clk,
        var int: wcet
        ) =
        DelayFor(run, end_clk, start_clk, wcet, mapped_clk) /\
        BoundedPrecedes(run, start_clk, end_clk, aux_clk, 1)
;
