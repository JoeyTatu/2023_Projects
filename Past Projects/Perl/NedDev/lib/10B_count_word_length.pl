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

my ($word) = @ARGV;
println length($word);

