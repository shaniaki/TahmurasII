include "../lib/tahmuras.mzn";

int: max_steps = 10;
int: num_clks = 3;

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clk_range: c1=1;constraint extract_clk(run,c1,[true ,false,false,true ,false,false,true ,false,false,false]);
clk_range: c2=2;constraint extract_clk(run,c2,[false,true ,false,true ,true ,true ,false,false,false,false]);

clk_range: c=3;array [steps_range] of var bool: c_barr; constraint extract_clk(run,c,c_barr);array [steps_range] of var int: c_conf = clk_conf(run,c);
var bool: b;
array [steps_range] of var set of clk_range: run;
% clk_range: aux_clk=4;
% constraint b = Coincides(run,c1,c2);constraint Coincides(run,c,c2);
% constraint b = SubClock(run,c1,c2);constraint SubClock(run,c2,c);
% constraint b = Exclusion(run,c1,c2);constraint Exclusion(run,c2,c);
% constraint b = Precedes(run,c1,c2);constraint Precedes(run,c,c2);
% constraint b = NonStrictPrecedes(run,c1,c2);constraint NonStrictPrecedes(run,c,c2);
% constraint Union(run,c,c1,c2);
% constraint Intersection(run,c,c1,c2);
% constraint Inf(run,c,c1,c2);
% constraint Sup(run,c,c1,c2);
% constraint NonStrictSampledOn(run,c,c1,c2);
% constraint SampledOn(run,c,c1,c2);
% constraint Wait(run,c,c2,2);
% constraint defered(c,c1,c1_conf,[6,1,3]);
% constraint deferedOn(c,c1,c2,[]);
% constraint UpTo(run,c,c1,c2);
% constraint Delay(run,c,c2,2);
% constraint BoundedPrecedes(run,c,c2,aux_clk,2);
% constraint FilterBy(run,c,c2,transient,periodic); array [1..3] of bool: transient = [true,false,false]; array [1..2] of bool: periodic = [true,false];
% constraint PacketFirst(run,c,c2,2);
constraint PacketLast(run,c,c1,2);
% constraint Periodic(run,c,c1,2,1);
% constraint DelayFor(run,c,c1,2,c2);

% solve maximize c_conf[max_steps];
solve satisfy;

output ["run: \(run)\n"
%         ++"c2: \(c2)-> \(c2_conf)\n"
        ++"c_barr:  \(c_barr) -> \(c_conf)\n"
        ++"\nb: \(b)"];


