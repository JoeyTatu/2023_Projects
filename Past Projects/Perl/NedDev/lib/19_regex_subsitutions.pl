# By: NedDev
# Video Title: perl5 #21: REGEX SUBSTITUTION // How to use Regex Substitution in perl
# Video URL: https://www.youtube.com/watch?v=l00aDqv42Pk

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib './Perl/NedDev/lib';

# s : substitution / match to change / what to change it to /
# m : match
# tr : transliterate (Same as 's, but with more than one change')

my $regex_string = "Once upon a regex";
$regex_string =~ s/Once/Twice/;
say $regex_string ;

# g : global
my $as = "A A A A A";
$as =~ s/A/B/g;
say $as;

# x : ingore whitespace
my $string = "A A A A A";
$string =~ s/A #This replaces As with Bs/B/gx;
say $string;
