# By: NedDev
# Video Title: perl5 #11: Ternary Operators // What are they? How do I use them?
# Video URL: https://www.youtube.com/watch?v=osc1wdgDFyw

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;
use Data::Dumper;

# IF ELSE

my $thing = "";

if (0){
    $thing = "Joey";
} else {
    $thing = "Bob";
}

println $thing;

my $thing2 = 0 ? "Joey" : "Bob";
println $thing2;

# IF ELSIF ELSE
my $thing3 = "";

if (0){
    $thing3 = "Joey";
} elsif (0){
    $thing3 = "water bottle";
} else {
    $thing3 = "crossaint";
}

println $thing3;

my $true = 1;
my $false = 0;

my $thing4 = 
    $false ? "Joey" : 
    $false ? "water bottle" : 
    "crossaint"; 
println $thing4;