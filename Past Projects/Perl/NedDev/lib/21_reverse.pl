# By: NedDev
# Video Title: perl5 #23: REVERSE FUNCTION // How to reverse an array, string or number
# Video URL: https://www.youtube.com/watch?v=lrB2d9mrA5Y

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib './Perl/NedDev/lib';

my @fruits = qw(apple cherry banana plum date coconut kiwi);

# forward
foreach my $fruit (@fruits){
    say $fruit;
}

say "";

# reverse
foreach my $fruit (reverse @fruits){
    say $fruit;
}

say "";

# Numbers and strings
my $number = 12345;

my $reversed_number = reverse $number;

say "Number:\t\t\t\t$number.\nReversed number:\t$reversed_number.";

my $string = "Supercalifragilisticexpialidocious";

my $reversed_string = reverse lc($string);

say "\nString:\t\t\t\t$string.\nReversed string:\t" . ucfirst$reversed_string . ".";