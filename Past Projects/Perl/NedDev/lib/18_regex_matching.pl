# By: NedDev
# Video Title: perl5 #20: REGEX MATCH // How to use Regex Matching in perl
# Video URL: https://www.youtube.com/watch?v=tVtyJQxsR4U

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

my $string = "Joey is 40-50% tattooed and has 22 piercings";

# Alphanumeric
if ($string =~ /\w/){
    say "Matched alphanumeric";
} else {
    say "Did not match alphanumeric";
}

# Digits
if ($string =~ m/\d/){
    say "Matched digits";
} else {
    say "Did not match digits";
}

# Access a capture group
# Single
my $food = "Joey loves cocktail sausages";

if ($food =~ m/(\w+)/) {
    say "Matched with \"$1\"";
}

# Multiple
if ($food =~ m/(\w+)\s(\w+)/) {
    say "Matched with \"$1\" and \"$2\"";
}

# Access capture group in an array
my $hobbies = "Joey enjoys coding with Perl and Python";

my @matches = $hobbies =~ m/(\w+)\s(\w+)\s(\w+)\s(\w+)\s(\w+)\s(\w+)\s(\w+)/;

foreach (@matches){
    say "Matched \"$_\"";
}


