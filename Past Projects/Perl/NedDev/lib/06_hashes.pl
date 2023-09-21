# By: NedDev
# perl5 #8: What is a Hash?
# Video URL: https://www.youtube.com/watch?v=quhycfv2Mgk

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

my %countries = (
    england => "small",
    austrailia => "large",
    germany => "medium",
);

# # Accessing value in hash
my $size_of_england = $countries{england};
# println $size_of_england;

# # Adding value
$countries{"peru"} = "very large";

# # Modifying value
$countries{"england"} = "very very large";

# # Delete value
delete $countries{"peru"};

print Dumper(\%countries);

# # QW Hash
my %food_qw = qw(
    burger 6.75
    chips 4.75
    cola 2.50
);

print Dumper(\%food_qw);
