include "ccsl.mzn";

% HSDF MoC
%% A token cannot be read before it has been written
predicate hsdf_token(array[steps_range] of var set of clk_range: run,
        clk_range: write,
        clk_range: read,
        clk_range: read_delay,
        var int: d
    ) =
    Delay(run,read_delay,read,d) /\
    Precedes(run,write,read_delay)
;

%% Inputs need to be read before actor firing (needs extension to SDF)
predicate hsdf_input(array[steps_range] of var set of clk_range: run,
        clk_range: actor,
        clk_range: read,
    ) =
    Precedes(run,read,actor)
;

%% Outputs are written upon actor firing (needs extension to SDF)
predicate hsdf_output(array[steps_range] of var set of clk_range: run,
        clk_range: actor,
        clk_range: write
    ) =
    Coincides(run,actor,write)
;

%% All the constraints implied by an SDF Arc (needs extension to SDF)
predicate hsdf_arc(array[steps_range] of var set of clk_range: run,
        clk_range: source,
        clk_range: target,
        clk_range: write,
        clk_range: read,
        clk_range: bp_write,
        clk_range: bp_read,
        clk_range: aux_clk1,
        clk_range: aux_clk2,
        var int: d,
        var int: buffer_size
    ) =
    % buffer size should hold at least the initial tokens
    buffer_size >= d /\
    % These 3 are the main constraints
    hsdf_output(run,source,write) /\
    hsdf_token(run,write,read,aux_clk1,d) /\
    hsdf_input(run,target,read) /\
    % and these model the limited buffer size
    hsdf_output(run,target,bp_write) /\
    hsdf_token(run,bp_write,bp_read,aux_clk2,buffer_size) /\
    hsdf_input(run,source,bp_read)
;

