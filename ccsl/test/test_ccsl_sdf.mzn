include "../lib/tahmuras.mzn";

int: max_steps = 12;
int: num_clks = 44;
array [steps_range] of var set of clk_range: run;


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
%                  │1    │  S
%                 ┌────┐1│  
%                 │ a3 │<┘  
%                 └────┘    
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clk_range: base_clk=1;

clk_range: a1_clk_start=2;
clk_range: a1_clk_end=3;
clk_range: a2_clk_start=4;
clk_range: a2_clk_end=5;
clk_range: a3_clk_start=6;
clk_range: a3_clk_end=7;

clk_range: a1_clk_mapped=8;
clk_range: a2_clk_mapped=9;
clk_range: a3_clk_mapped=10;

clk_range: c1_r_clk=11;
clk_range: c2_r_clk=12;
clk_range: c3_r_clk=13;

clk_range: c1_w_clk=14;
clk_range: c2_w_clk=15;
clk_range: c3_w_clk=16;

clk_range: c1_bpr_clk=17;
clk_range: c2_bpr_clk=18;
clk_range: c3_bpr_clk=19;

clk_range: c1_bpw_clk=20;
clk_range: c2_bpw_clk=21;
clk_range: c3_bpw_clk=22;

clk_range: c1_aux1_clk=23;
clk_range: c2_aux1_clk=24;
clk_range: c3_aux1_clk=25;

clk_range: c1_aux2_clk=26;
clk_range: c2_aux2_clk=27;
clk_range: c3_aux2_clk=28;

clk_range: c1_aux3_clk=29;
clk_range: c2_aux3_clk=30;
clk_range: c3_aux3_clk=31;

clk_range: c1_aux4_clk=32;
clk_range: c2_aux4_clk=33;
clk_range: c3_aux4_clk=34;

clk_range: c1_aux5_clk=35;
clk_range: c2_aux5_clk=36;
clk_range: c3_aux5_clk=37;

clk_range: c1_aux6_clk=38;
clk_range: c2_aux6_clk=39;
clk_range: c3_aux6_clk=40;

clk_range: a1_aux_clk=41;
clk_range: a2_aux_clk=42;
clk_range: a3_aux_clk=43;

clk_range: base_aux=44;

array [1..3] of var 1..10: c_size;

constraint sdf_actor(run,a1_clk_start,a1_clk_end,a1_clk_mapped,a1_aux_clk,1);
constraint sdf_actor(run,a2_clk_start,a2_clk_end,a2_clk_mapped,a2_aux_clk,1);
constraint sdf_actor(run,a3_clk_start,a3_clk_end,a3_clk_mapped,a3_aux_clk,1);

constraint sdf_arc(run,a1_clk_end,a2_clk_start,c1_w_clk,c1_r_clk,c1_bpw_clk,c1_bpr_clk,c1_aux1_clk,c1_aux2_clk,c1_aux3_clk,c1_aux4_clk,c1_aux5_clk,c1_aux6_clk,1,2,0,c_size[1]);
constraint sdf_arc(run,a2_clk_end,a3_clk_start,c2_w_clk,c2_r_clk,c2_bpw_clk,c2_bpr_clk,c2_aux1_clk,c2_aux2_clk,c2_aux3_clk,c2_aux4_clk,c2_aux5_clk,c2_aux6_clk,2,1,0,c_size[2]);
constraint sdf_arc(run,a3_clk_end,a2_clk_start,c3_w_clk,c3_r_clk,c3_bpw_clk,c3_bpr_clk,c3_aux1_clk,c3_aux2_clk,c3_aux3_clk,c3_aux4_clk,c3_aux5_clk,c3_aux6_clk,1,2,2,c_size[3]);

% These are constraints comming from the single processor platform (no overlap)
constraint Exclusion(run,a1_clk_mapped,a2_clk_mapped);
constraint Exclusion(run,a1_clk_mapped,a3_clk_mapped);
constraint Exclusion(run,a2_clk_mapped,a3_clk_mapped);

% Union of all clocks is the base clock
constraint Union(run,base_aux,a2_clk_mapped,a3_clk_mapped);
constraint Union(run,base_clk,a1_clk_mapped,base_aux);


% the base clock always ticks
constraint forall (i in steps_range) (base_clk in run[i]);

% solving: schedule for minimum buffer size
solve :: seq_search([int_search(c_size, first_fail, indomain_min, complete),
    set_search(run, input_order, indomain_max, complete)
    ])
    minimize sum (i in index_set(c_size))(c_size[i]);

output ["run: \(run)\n" ++
%       "computation task start & ends:\n"
%       ++show(a1_clk_start)++show(a1_clk_end)++"\n"
%       ++show(a2_clk_start)++show(a2_clk_end)++"\n"
%       ++show(a3_clk_start)++show(a3_clk_end)++"\n"
%       ++"mapped computation:\n"
%       ++show(a1_clk_mapped)++"\n"
%       ++show(a2_clk_mapped)++"\n"
%       ++show(a3_clk_mapped)++"\n"
%       ++show(base_clk)++"\n"
%       ++"communication:\n"++
%         show(c1_r_clk)++show(c1_w_clk)++"\n"++
%         show(c2_r_clk)++show(c2_w_clk)++"\n"++
%         show(c3_r_clk)++show(c3_w_clk)++"\n"++
        "buffers: \(c_size)"
    ];

%to force production of a minimum schedule (not a nice way)
constraint clk_conf(run,a1_clk_end)[max_steps]>=2 /\ clk_conf(run,a2_clk_end)[max_steps]>=1 /\ clk_conf(run,a3_clk_end)[max_steps]>=2;
