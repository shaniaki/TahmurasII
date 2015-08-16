include "../lib/ccsl-hsdf.mzn";

int: max_steps = 100;
int: num_clks = 60;
array [steps_range] of var set of clk_range: run;

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% An HSDFG (weights are all 1).
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%
%     -->|c1|-->|a2|-->|c2|--
%   / -->|c3|-->|a3|-->|c4|-- \
%  / /                        \\
% |a1|                     	  |a6|
% ^\ \                        // |
% | \ -->|c5|-->|a4|-->|c6|-- /  |
% |   -->|c7|-->|a5|-->|c8|--    |
%  -------------|c9|<------------
%                •
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clk_range: a1_clk=1;
clk_range: a2_clk=2;
clk_range: a3_clk=3;
clk_range: a4_clk=4;
clk_range: a5_clk=5;
clk_range: a6_clk=6;

clk_range: c1_r_clk=7;
clk_range: c2_r_clk=8;
clk_range: c3_r_clk=9;
clk_range: c4_r_clk=10;
clk_range: c5_r_clk=11;
clk_range: c6_r_clk=12;
clk_range: c7_r_clk=13;
clk_range: c8_r_clk=14;
clk_range: c9_r_clk=15;

clk_range: c1_w_clk=16;
clk_range: c2_w_clk=17;
clk_range: c3_w_clk=18;
clk_range: c4_w_clk=19;
clk_range: c5_w_clk=20;
clk_range: c6_w_clk=21;
clk_range: c7_w_clk=22;
clk_range: c8_w_clk=23;
clk_range: c9_w_clk=24;

clk_range: c1_bpr_clk=25;
clk_range: c2_bpr_clk=26;
clk_range: c3_bpr_clk=27;
clk_range: c4_bpr_clk=28;
clk_range: c5_bpr_clk=29;
clk_range: c6_bpr_clk=30;
clk_range: c7_bpr_clk=31;
clk_range: c8_bpr_clk=32;
clk_range: c9_bpr_clk=33;

clk_range: c1_bpw_clk=34;
clk_range: c2_bpw_clk=35;
clk_range: c3_bpw_clk=36;
clk_range: c4_bpw_clk=37;
clk_range: c5_bpw_clk=38;
clk_range: c6_bpw_clk=39;
clk_range: c7_bpw_clk=40;
clk_range: c8_bpw_clk=41;
clk_range: c9_bpw_clk=42;

clk_range: c1_aux1_clk=43;
clk_range: c2_aux1_clk=44;
clk_range: c3_aux1_clk=45;
clk_range: c4_aux1_clk=46;
clk_range: c5_aux1_clk=47;
clk_range: c6_aux1_clk=48;
clk_range: c7_aux1_clk=49;
clk_range: c8_aux1_clk=50;
clk_range: c9_aux1_clk=51;

clk_range: c1_aux2_clk=52;
clk_range: c2_aux2_clk=53;
clk_range: c3_aux2_clk=54;
clk_range: c4_aux2_clk=55;
clk_range: c5_aux2_clk=56;
clk_range: c6_aux2_clk=57;
clk_range: c7_aux2_clk=58;
clk_range: c8_aux2_clk=59;
clk_range: c9_aux2_clk=60;

array [1..9] of var 1..10: c_size;

constraint hsdf_arc(run,a1_clk,a2_clk,c1_w_clk,c1_r_clk,c1_bpw_clk,c1_bpr_clk,c1_aux1_clk,c1_aux2_clk,0,c_size[1]);
constraint hsdf_arc(run,a2_clk,a6_clk,c2_w_clk,c2_r_clk,c2_bpw_clk,c2_bpr_clk,c2_aux1_clk,c2_aux2_clk,0,c_size[2]);
constraint hsdf_arc(run,a1_clk,a3_clk,c3_w_clk,c3_r_clk,c3_bpw_clk,c3_bpr_clk,c3_aux1_clk,c3_aux2_clk,0,c_size[3]);
constraint hsdf_arc(run,a3_clk,a6_clk,c4_w_clk,c4_r_clk,c4_bpw_clk,c4_bpr_clk,c4_aux1_clk,c4_aux2_clk,0,c_size[4]);
constraint hsdf_arc(run,a1_clk,a4_clk,c5_w_clk,c5_r_clk,c5_bpw_clk,c5_bpr_clk,c5_aux1_clk,c5_aux2_clk,0,c_size[5]);
constraint hsdf_arc(run,a4_clk,a6_clk,c6_w_clk,c6_r_clk,c6_bpw_clk,c6_bpr_clk,c6_aux1_clk,c6_aux2_clk,0,c_size[6]);
constraint hsdf_arc(run,a1_clk,a5_clk,c7_w_clk,c7_r_clk,c7_bpw_clk,c7_bpr_clk,c7_aux1_clk,c7_aux2_clk,0,c_size[7]);
constraint hsdf_arc(run,a5_clk,a6_clk,c8_w_clk,c8_r_clk,c8_bpw_clk,c8_bpr_clk,c8_aux1_clk,c8_aux2_clk,0,c_size[8]);
constraint hsdf_arc(run,a6_clk,a1_clk,c9_w_clk,c9_r_clk,c9_bpw_clk,c9_bpr_clk,c9_aux1_clk,c9_aux2_clk,1,c_size[9]);

% solving: schedule for minimum buffer size
solve :: seq_search([
    int_search(c_size, first_fail, indomain_min, complete),
    set_search(run, input_order, indomain_max, complete)
    ])
    minimize sum (i in index_set(c_size))(c_size[i]);

% printing the output
output ["run: \(run)\n" ++
        "buffer size: " ++ show(sum (i in index_set(c_size))(c_size[i]))];

%to force production of a schedule
constraint clk_conf(run,a6_clk)[max_steps]>0;
