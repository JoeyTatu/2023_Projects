# By: NedDev
# Video Title: perl5 #26: GREP & MAP // What is the difference between grep and map?
# Video URL: https://www.youtube.com/watch?v=NocEcWAGwQc

use strict;
use warnings;
use feature "say";
use Data::Dumper;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib './Perl/NedDev/lib';

my @map = map{$_ + 1}(1 .. 8); # map checks and edits
my @grep = grep{$_ + 1}(1 .. 8); # grep checks but does not edit

say Dumper(\@map);
say Dumper(\@grep);

say "";

my @map2 = map{$_ % 2 == 0}(1 .. 8); # prints true/false
my @grep2 = grep{$_ % 2 == 0}(1 .. 8); # returns, if true

say Dumper(\@map2);
say Dumper(\@grep2);


