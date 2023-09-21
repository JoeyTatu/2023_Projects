# By: NedDev
# perl5 #6: Arrays @
# Video URL: https://www.youtube.com/watch?v=5KTq4xtbMyc

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

# # # # # Arrays
my @array = ("Joey", "Tatú", "1 Main Street");

my @list_of_things = ("String", 1, 0.1, undef);

my $thing = "Phone";
my @list_of_things2 = ("hello", 1, 5, $thing);

# # # # # Accessing arrays
my $element = $array[1];

# Don't do this:
my $scalar = "string";
my @neat = ("string", "string1", $element);
my $neat_element = $neat[2]; # Both $element and $neat_element are the same

# # # # # qw Arrays (Quote word)
my @quote_word_array = qw(Each of these words are an array element);
my @quote_word_array_slash = qw/Each of these words are an array element/;

# # # # # Length of array

println scalar @quote_word_array;
println scalar @quote_word_array_slash;