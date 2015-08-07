include "globals.mzn";
include "ccsl.mzn";
% include "ccsl-hsdf.mzn";
% include "ccsl-sdf.mzn";
% include "ccsl-taskset.mzn";

%function array [int] of var int: matrix_row(
%        array [int,int] of var int: matrix,
%        int: row_no
%    ) :: promise_total = let {
%        array [index_set_1of2(matrix)] of var int: row,
%        constraint row = [matrix[row_no,col]|col in index_set_2of2(matrix)]
%    } in row
%;

% accepts a graph relation and a component index c1
% returns the set of components that c1 maps to
function var set of int: MapsTo(
        array [int,int] of var 0..1: rel_graph,
        var int: c1
    ) :: promise_total = let {
        var set of index_set_2of2(rel_graph): c2s;
%         assert(c1 in index_set_1of2(rel_graph),
%             "component index out of range in MapsTo",
        constraint
            forall (j in index_set_2of2(rel_graph) where rel_graph[c1,j]>0) (j in c2s) /\
            sum(j in index_set_2of2(rel_graph)) (bool2int(rel_graph[c1,j] != 0)) = card(c2s)
        ;
%         );
    } in c2s
;

% accepts a graph relation and a component index c2
% returns the set of components that are mapped to c2
function var set of int: MappedTo(
        array [int,int] of var 0..1: rel_graph,
        var int: c2
    ) :: promise_total = let {
        var set of index_set_1of2(rel_graph): c1s;
%         assert(c2 in index_set_2of2(rel_graph),
%             "component index out of range in MappedTo",
        constraint
            forall (j in index_set_1of2(rel_graph) where rel_graph[j,c2]>0) (j in c1s) /\
            sum(j in index_set_1of2(rel_graph)) (bool2int(rel_graph[j,c2] != 0)) = card(c1s)
        ;
%         );
    } in c1s
;
