# By: NedDev
# perl5 #7: Data::Dumper // Simple Tutorial
# Video URL: https://www.youtube.com/watch?v=j8r9eUKEVtw

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

my $scalar = "string";
my @array = ("1", 2, 5, 1.4);

my %hash = (
    name => "Joey",
    height => "6ft0",
    interest => ["tattoos", "piercings", "dogs"]
);

println Dumper(\$scalar);
println Dumper(\@array);
println Dumper(\%hash);