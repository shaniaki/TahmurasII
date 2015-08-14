include "../lib2/ccsl-sdf.mzn";

int: max_steps = 12;


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% An SDFG
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% ┌────┐1  ┌──┐  2┌────┐    
% │ a1 │──>│c1│──>│ a2 │─┐  
% └────┘   └──┘   └────┘2│  
%                  ^2    │  
%                  │     │  
%                 ┌──┐  ┌──┐
%               ••│c3│  │c2│
%                 └──┘  └──┘
%                  │1    │  
%                 ┌────┐1│  
%                 │ a3 │<┘  
%                 └────┘    
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

array [steps_range] of var ibool: base_clk;

array [steps_range] of var ibool: a1_clk_start;
array [steps_range] of var ibool: a1_clk_end;
array [steps_range] of var ibool: a2_clk_start;
array [steps_range] of var ibool: a2_clk_end;
array [steps_range] of var ibool: a3_clk_start;
array [steps_range] of var ibool: a3_clk_end;

array [steps_range] of var ibool: a1_clk_mapped;
array [steps_range] of var ibool: a2_clk_mapped;
array [steps_range] of var ibool: a3_clk_mapped;

array[steps_range] of var ibool: c1_r_clk;
array[steps_range] of var ibool: c2_r_clk;
array[steps_range] of var ibool: c3_r_clk;

array[steps_range] of var ibool: c1_w_clk;
array[steps_range] of var ibool: c2_w_clk;
array[steps_range] of var ibool: c3_w_clk;

array [1..3] of var 1..10: c_size;

constraint sdf_actor(a1_clk_start,a1_clk_end,a1_clk_mapped,1);
constraint sdf_actor(a2_clk_start,a2_clk_end,a2_clk_mapped,1);
constraint sdf_actor(a3_clk_start,a3_clk_end,a3_clk_mapped,1);

constraint sdf_arc(a1_clk_end,a2_clk_start,c1_w_clk,c1_r_clk,1,2,0,c_size[1]);
constraint sdf_arc(a2_clk_end,a3_clk_start,c2_w_clk,c2_r_clk,2,1,0,c_size[2]);
constraint sdf_arc(a3_clk_end,a2_clk_start,c3_w_clk,c3_r_clk,1,2,2,c_size[3]);

% These are constraints comming from the single processor platform (no overlap)
constraint Exclusion(a1_clk_mapped,a2_clk_mapped);
constraint Exclusion(a1_clk_mapped,a3_clk_mapped);
constraint Exclusion(a2_clk_mapped,a3_clk_mapped);

% Union of all clocks is the base clock
constraint base_clk = Union(a1_clk_mapped,Union(a2_clk_mapped,a3_clk_mapped));


% the base clock always ticks
constraint forall (i in steps_range) (base_clk[i]=1);

% solving: schedule for minimum buffer size
solve :: seq_search([int_search(c_size, first_fail, indomain_min, complete)] ++
    [int_search([a1_clk_mapped[s],a2_clk_mapped[s],a3_clk_mapped[s],
                 a1_clk_start[s],a2_clk_start[s],a3_clk_start[s]], 
                input_order, indomain_max, complete)
      | s in steps_range]
%     int_search(a1_clk_mapped, input_order, indomain_max, complete),
%     int_search(a2_clk_mapped, input_order, indomain_max, complete),
%     int_search(a3_clk_mapped, input_order, indomain_max, complete),
%     int_search(a1_clk_start, input_order, indomain_max, complete),
%     int_search(a2_clk_start, input_order, indomain_max, complete),
%     int_search(a3_clk_start, input_order, indomain_max, complete)
%     ]
    )
    minimize sum (i in index_set(c_size))(c_size[i]);

output ["computation task start & ends:\n"
      ++show(a1_clk_start)++show(a1_clk_end)++"\n"
      ++show(a2_clk_start)++show(a2_clk_end)++"\n"
      ++show(a3_clk_start)++show(a3_clk_end)++"\n"
      ++"mapped computation:\n"
      ++show(a1_clk_mapped)++"\n"
      ++show(a2_clk_mapped)++"\n"
      ++show(a3_clk_mapped)++"\n"
      ++show(base_clk)++"\n"
      ++"communication:\n"++
        show(c1_r_clk)++show(c1_w_clk)++"\n"++
        show(c2_r_clk)++show(c2_w_clk)++"\n"++
        show(c3_r_clk)++show(c3_w_clk)++"\n"++
        "buffers: " ++ show(c_size)
    ];

%to force production of a minimum schedule (not a nice way)
constraint clk_conf(a1_clk_end)[max_steps]>=2 /\ clk_conf(a2_clk_end)[max_steps]>=1 /\ clk_conf(a3_clk_end)[max_steps]>=2;
