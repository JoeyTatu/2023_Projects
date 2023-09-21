# By: NedDev
# Video Title: perl5 #10: Array Functions // POP, PUSH, SHIFT, UNSHIFT
# Video URL: https://www.youtube.com/watch?v=FYxrJliT7fI

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;
use Data::Dumper;

# POP - Removes LAST value
println "POP:";

my @array_pop = ("Joey", "Sam", "Bonnie", "Lola", "Ned");

println Dumper(\@array_pop);
my $popped_value = pop(@array_pop);

println "After Pop:";
println Dumper(\@array_pop);
println "Value popped: ", $popped_value;

# PUSH - Adds value to end
println "\nPUSH:";

my @array_push = ("fish", "chips", "pie", "burger");
println Dumper(\@array_push);
push(@array_push, "battered mushrooms");

println "After PUSH:";
println Dumper(\@array_push);
println "Value pushed: ", $array_push[-1];

# SHIFT - Removes FIRST value
println "\nSHIFT:";

my @array_shift = ("red", "blue", "green", "yellow");
println Dumper(\@array_shift);

my $shifted_value = shift(@array_shift);
println "After SHIFT:";
println Dumper(\@array_shift);

println "Value shifted: ", $shifted_value;

# UNSHIFT - Adds value to start
println "\nUNSHIFT:";

my @array_unshift = ("Apple", "Samsung", "Nokia", "Motorola");
println Dumper(\@array_unshift);

unshift(@array_unshift, "LG");
println "After UNSHIFT:";
println Dumper(\@array_unshift);

println "Value unshifted: ", $array_unshift[0];

# POP WITH QW:
println "POP WITH QW:";

my @array_pop_qw = qw(brown green clear blue);
println Dumper(\@array_pop_qw);
my $popped_value_qw = pop(@array_pop_qw);

println "After Pop:";
println Dumper(\@array_pop_qw);
println "Value popped: ", $popped_value_qw;
