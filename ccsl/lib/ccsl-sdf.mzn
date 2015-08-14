include "ccsl.mzn";

% SDF MoC
%% A token cannot be read before it has been written
predicate sdf_token(array [steps_range] of var ibool: write,
        array [steps_range] of var ibool: read,
        var int: d
    ) =
    Precedes(write,Delay(read,d))
;

%% Inputs need to be read before actor firing (needs extension to SDF)
predicate sdf_input(array [steps_range] of var ibool: actor,
        array[steps_range] of var int: read,
        int: weight
    ) =
    Precedes(PacketLast(read,weight),actor)
;

%% Outputs are written upon actor firing (needs extension to SDF)
predicate sdf_output(array [steps_range] of var ibool: actor,
        array[steps_range] of var ibool: write,
        int: weight
    ) =
    Coincides(actor,PacketFirst(write,weight))
;

%% All the constraints implied by an SDF Arc (needs extension to SDF)
predicate sdf_arc(array[steps_range] of var ibool: source,
        array[steps_range] of var ibool: target,
        array[steps_range] of var ibool: write,
        array[steps_range] of var ibool: read,
        int: out_weight,
        int: in_weight,
        var int: d,
        var int: buffer_size
    ) =
     let {
         array[steps_range] of var ibool: bp_read,
         array[steps_range] of var ibool: bp_write
     } in
    % buffer size should hold at least the initial tokens
    % buffer_size >= d /\ buffer_size >= out_weight /\
    % These 3 are the main constraints
    sdf_output(source,write,out_weight) /\
    sdf_token(write,read,d) /\
    sdf_input(target,read,in_weight) /\
    % and these model the limited buffer size
    sdf_output(target,bp_write,in_weight) /\
    sdf_token(bp_write,bp_read,buffer_size) /\
    sdf_input(source,bp_read,out_weight)
%     Delay(bp_write,bp_write_conf,buffer_size) /\
%     NonStrictPrecedes(bp_write_conf,read_conf)
;

% Constraints regarding the execution of an actor
predicate sdf_actor(array[steps_range] of var ibool: start_clk,
        array[steps_range] of var ibool: end_clk,
        array[steps_range] of var ibool: mapped_clk,
        var int: wcet
        ) =
        end_clk = DelayFor(start_clk, wcet, mapped_clk) /\
        BoundedPrecedes(start_clk,end_clk,1)
;
