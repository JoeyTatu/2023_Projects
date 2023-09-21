# By: NedDev
# Video Title: perl5 #12: Command Line Argument // @ARGV
# Video URL: https://www.youtube.com/watch?v=Dpo2k8xRbn8

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;
use Data::Dumper;

println Dumper(\@ARGV);

my $first_element = $ARGV[0];
println $first_element;

my ($first_array_element, $second_array_element) = @ARGV;
println $first_array_element, "\n", $second_array_element;
