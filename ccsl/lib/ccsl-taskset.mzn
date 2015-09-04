include "ccsl.mzn";

% A task-set MoC

%% A preemptable periodic task with start and end clocks,
%% period and offsets in terms of the base time clock and wcet in terms of the mapped clock on the resource
predicate ts_periodic(array[steps_range] of var bool: start_clk,
        array[steps_range] of var bool: end_clk,
        array[steps_range] of var bool: mapped_clk,
        var int: period,
        var int: offset,
        var int: wcet
    ) =
        end_clk = DelayFor(start_clk, wcet, mapped_clk) /\
        BoundedPrecedes(start_clk,end_clk,1) /\
        start_clk = Periodic(base_clk, period, offset) /\
        NonStrictPrecedes(end_clk,DelayFor(start_clk, period, base_clk))
;