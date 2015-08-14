include "../lib/tahmuras.mzn";

int: max_steps = 10;

%int: max_instants = 10;

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

array [steps_range] of bool: c1 = [true ,false,false,true ,false,false,true ,false,false,false]; array [steps_range] of var int: c1_conf; constraint c1_conf = clk_conf(c1);
array [steps_range] of bool: c2 = [false,true ,false,true ,true ,true ,false,false,false,false]; array [steps_range] of var int: c2_conf; constraint c2_conf = clk_conf(c2);

array [steps_range] of var bool: c; array [steps_range] of var int: c_conf; constraint c_conf = clk_conf(c);
var bool: b;

% constraint b = Coincides(c1,c2);constraint Coincides(c,c2);
% constraint b = SubClock(c1,c2);constraint SubClock(c2,c);
% constraint b = Exclusion(c1,c2);constraint Exclusion(c2,c);
% constraint b = Precedes(c1,c2);constraint Precedes(c,c2);
% constraint b = NonStrictPrecedes(c1,c2);constraint NonStrictPrecedes(c,c2);
% constraint c = Union(c1,c2);
% constraint c = Intersection(c1,c2);
% constraint c = Inf(c1,c2);
% constraint c = Sup(c1,c2);
% constraint c = NonStrictSampledOn(c1,c2);
% constraint c = SampledOn(c1,c2);
% constraint c = Wait(c2,2);
% constraint defered(c,c1,c1_conf,[6,1,3]);
% constraint deferedOn(c,c1,c2,[]);
% constraint c = UpTo(c1,c2);
% constraint c = Delay(c2,2);
% constraint BoundedPrecedes(c,c2,2);
constraint c = FilterBy(c2,transient,periodic); array [1..3] of bool: transient = [true,false,false]; array [1..2] of bool: periodic = [true,false];
% constraint c = PacketFirst(c1,2);
% constraint c = PacketLast(c1,2);
% constraint c = Periodic(c2,2,1);
% constraint c = DelayFor(c1,2,c2);

% solve maximize c_conf[max_steps];
solve satisfy;

output ["c1: \(c1)-> \(c1_conf)\n"
        ++"c2: \(c2)-> \(c2_conf)\n"
        ++"c:  \(c)-> \(c_conf)\n"
        ++"\nb: \(b)"];


