# By: NedDev
# Video Title: perl5 #15: C-Style for Loops // C for loops in perl
# Video URL: https://www.youtube.com/watch?v=VYeJ2WhJyp4

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

# for (START, STOP, INTERATOR){

# }


# for (my $i = 0; $i <= 10; $i++) {
#     println $i;
# }

my @array = qw(apple banana cherry date pumpkin);
my $array_size = @array;

for (my $i = 0; $i < $array_size; $i++){
    my $element = $array[$i];;
    println "Element at index $i: $element";
}

println;

for (my $x = $array_size - 1; $x >= 0; $x--){
    my $element = $array[$x];
    println ("Element at index " . ($x + 1) . " is " . $element);
}