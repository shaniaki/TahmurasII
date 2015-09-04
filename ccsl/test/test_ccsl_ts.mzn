include "../lib/tahmuras.mzn";

int: max_steps = 25;

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% A periodic task set.
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% T1 = (1,3)
% T2 = (1,4)
% T3 = (2,6)
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

array [steps_range] of var bool: base_clk;

array [steps_range] of var bool: t1_clk_start;
array [steps_range] of var bool: t1_clk_end;
array [steps_range] of var bool: t2_clk_start;
array [steps_range] of var bool: t2_clk_end;
array [steps_range] of var bool: t3_clk_start;
array [steps_range] of var bool: t3_clk_end;

array [steps_range] of var bool: t1_clk_mapped;array [steps_range] of var int: t1_clk_mapped_conf; constraint t1_clk_mapped_conf = clk_conf(t1_clk_mapped);
array [steps_range] of var bool: t2_clk_mapped;array [steps_range] of var int: t2_clk_mapped_conf; constraint t2_clk_mapped_conf = clk_conf(t2_clk_mapped);
array [steps_range] of var bool: t3_clk_mapped;array [steps_range] of var int: t3_clk_mapped_conf; constraint t3_clk_mapped_conf = clk_conf(t3_clk_mapped);

constraint ts_periodic(t1_clk_start,t1_clk_end,t1_clk_mapped,3,0,1);
constraint ts_periodic(t2_clk_start,t2_clk_end,t2_clk_mapped,4,0,1);
constraint ts_periodic(t3_clk_start,t3_clk_end,t3_clk_mapped,6,0,2);

% These are constraints comming from the single processor platform (no overlap)
constraint Exclusion(t1_clk_mapped,t2_clk_mapped);
constraint Exclusion(t1_clk_mapped,t3_clk_mapped);
constraint Exclusion(t2_clk_mapped,t3_clk_mapped);

% Union of all clocks is the base clock
constraint base_clk = Union(t1_clk_mapped,Union(t2_clk_mapped,t3_clk_mapped));

% the base clock always ticks
constraint forall (i in steps_range) (base_clk[i]=1);

% solving: maximum instants to schedule for longer time
solve :: seq_search([
    int_search(t1_clk_mapped, input_order, indomain_max, complete),
    int_search(t2_clk_mapped, input_order, indomain_max, complete),
    int_search(t3_clk_mapped, input_order, indomain_max, complete),
    int_search(t1_clk_start, input_order, indomain_max, complete),
    int_search(t2_clk_start, input_order, indomain_max, complete),
    int_search(t3_clk_start, input_order, indomain_max, complete),
    ]) maximize t1_clk_mapped_conf[max_steps]*t2_clk_mapped_conf[max_steps]*t3_clk_mapped_conf[max_steps];

% printing the output
output ["task start & ends:\n"
      ++show(t1_clk_start)++show(t1_clk_end)++"\n"
      ++show(t2_clk_start)++show(t2_clk_end)++"\n"
      ++show(t3_clk_start)++show(t3_clk_end)++"\n"
      ++"mapped:\n"
      ++show(t1_clk_mapped)++"\n"
      ++show(t2_clk_mapped)++"\n"
      ++show(t3_clk_mapped)++"\n"
      ++show(base_clk)++"\n"
      ];