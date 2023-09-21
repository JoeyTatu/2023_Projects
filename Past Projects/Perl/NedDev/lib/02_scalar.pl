# By: NedDev
# perl5 #4: Scalar (part 2) Variable Types
# Video URL: https://www.youtube.com/watch?v=JVPFH83OB88

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

# println "CWD: ", getcwd();

# # # # # Basic Scalar Types

my $string = "str";
my $integer = 123;
my $float = 3.14159;

println $string;
println $integer;
println $float;

# # # # #  Other Scalar Types
my $undefined = undef;
# println $undefined;

# # Scalar Refs
my $first_name = "Joey";
my $last_name = "Tatú";

my $full_name = $first_name . " " . $last_name;
println "Full name: $full_name";