include "../lib2/ccsl-hsdf.mzn";

int: max_steps = 10;

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

array[steps_range] of var ibool: a1_clk;
array[steps_range] of var ibool: a2_clk;
array[steps_range] of var ibool: a3_clk;
array[steps_range] of var ibool: a4_clk;
array[steps_range] of var ibool: a5_clk;
array[steps_range] of var ibool: a6_clk;

array[steps_range] of var ibool: c1_r_clk;
array[steps_range] of var ibool: c2_r_clk;
array[steps_range] of var ibool: c3_r_clk;
array[steps_range] of var ibool: c4_r_clk;
array[steps_range] of var ibool: c5_r_clk;
array[steps_range] of var ibool: c6_r_clk;
array[steps_range] of var ibool: c7_r_clk;
array[steps_range] of var ibool: c8_r_clk;
array[steps_range] of var ibool: c9_r_clk;

array[steps_range] of var ibool: c1_w_clk;
array[steps_range] of var ibool: c2_w_clk;
array[steps_range] of var ibool: c3_w_clk;
array[steps_range] of var ibool: c4_w_clk;
array[steps_range] of var ibool: c5_w_clk;
array[steps_range] of var ibool: c6_w_clk;
array[steps_range] of var ibool: c7_w_clk;
array[steps_range] of var ibool: c8_w_clk;
array[steps_range] of var ibool: c9_w_clk;

array [1..9] of var 1..10: c_size;

constraint hsdf_arc(a1_clk,a2_clk,c1_w_clk,c1_r_clk,0,c_size[1]);
constraint hsdf_arc(a2_clk,a6_clk,c2_w_clk,c2_r_clk,0,c_size[2]);
constraint hsdf_arc(a1_clk,a3_clk,c3_w_clk,c3_r_clk,0,c_size[3]);
constraint hsdf_arc(a3_clk,a6_clk,c4_w_clk,c4_r_clk,0,c_size[4]);
constraint hsdf_arc(a1_clk,a4_clk,c5_w_clk,c5_r_clk,0,c_size[5]);
constraint hsdf_arc(a4_clk,a6_clk,c6_w_clk,c6_r_clk,0,c_size[6]);
constraint hsdf_arc(a1_clk,a5_clk,c7_w_clk,c7_r_clk,0,c_size[7]);
constraint hsdf_arc(a5_clk,a6_clk,c8_w_clk,c8_r_clk,0,c_size[8]);
constraint hsdf_arc(a6_clk,a1_clk,c9_w_clk,c9_r_clk,1,c_size[9]);

% solving: schedule for minimum buffer size
solve :: seq_search([
    int_search(c_size, first_fail, indomain_min, complete),
    int_search(a1_clk, input_order, indomain_max, complete),
    int_search(a2_clk, input_order, indomain_max, complete),
    int_search(a3_clk, input_order, indomain_max, complete),
    int_search(a4_clk, input_order, indomain_max, complete),
    int_search(a5_clk, input_order, indomain_max, complete),
    int_search(a6_clk, input_order, indomain_max, complete)
    ])
    minimize sum (i in index_set(c_size))(c_size[i]);

% printing the output
output ["computation:\n"++
        show(a1_clk)++"\n"++show(a2_clk)++"\n"++show(a3_clk)++"\n"++
        show(a4_clk)++"\n"++show(a5_clk)++"\n"++show(a6_clk)++"\n"++
        "communication:\n"++
        show(c1_r_clk)++" "++show(c1_w_clk)++"\n"++
        show(c2_r_clk)++" "++show(c2_w_clk)++"\n"++
        show(c3_r_clk)++" "++show(c3_w_clk)++"\n"++
        show(c4_r_clk)++" "++show(c4_w_clk)++"\n"++
        show(c5_r_clk)++" "++show(c5_w_clk)++"\n"++
        show(c6_r_clk)++" "++show(c6_w_clk)++"\n"++
        show(c7_r_clk)++" "++show(c7_w_clk)++"\n"++
        show(c8_r_clk)++" "++show(c8_w_clk)++"\n"++
        "buffer size: " ++ show(sum (i in index_set(c_size))(c_size[i]))];

%to force production of a schedule
constraint clk_conf(a6_clk)[max_steps]>0;
