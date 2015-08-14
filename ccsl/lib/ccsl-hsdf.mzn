include "ccsl.mzn";

% HSDF MoC
%% A token cannot be read before it has been written
predicate hsdf_token(array [steps_range] of var ibool: write,
        array [steps_range] of var ibool: read,
        var int: d
    ) =
    Precedes(write,Delay(read,d))
;

%% Inputs need to be read before actor firing (needs extension to SDF)
predicate hsdf_input(array [steps_range] of var ibool: actor,
        array[steps_range] of var int: read,
    ) =
    Precedes(read,actor)
;

%% Outputs are written upon actor firing (needs extension to SDF)
predicate hsdf_output(array [steps_range] of var ibool: actor,
        array [steps_range] of var ibool: write
    ) =
    Coincides(actor,write)
;

%% All the constraints implied by an SDF Arc (needs extension to SDF)
predicate hsdf_arc(array[steps_range] of var ibool: source,
        array[steps_range] of var ibool: target,
        array[steps_range] of var ibool: write,
        array[steps_range] of var ibool: read,
        var int: d,
        var int: buffer_size
    ) =
    let {
        array[steps_range] of var ibool: bp_read,
        array[steps_range] of var ibool: bp_write
    } in
    % buffer size should hold at least the initial tokens
    buffer_size >= d /\
    % These 3 are the main constraints
    hsdf_output(source,write) /\
    hsdf_token(write,read,d) /\
    hsdf_input(target,read) /\
    % and these model the limited buffer size
    hsdf_output(target,bp_write) /\
    hsdf_token(bp_write,bp_read,buffer_size) /\
    hsdf_input(source,bp_read)
;

