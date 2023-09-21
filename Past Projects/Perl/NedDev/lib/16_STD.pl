# By: NedDev
# Video Title: perl5 #18: STDIN, STDOUT, STDERR // How to get user input
# Video URL: https://www.youtube.com/watch?v=SOsOiiGvj2o

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

# STDIN

# say "STDIN: Please enter input: ";
# my $input = <STDIN>;
# say "STDIN: Your input is: $input";

# STDOUT, STDERR

# my $name = "Joey";
# say STDOUT $name;

# my $first_name = "Joey";
# my $last_name = "Tatu";

# say STDERR $first_name, " ", $last_name;

say STDOUT "What is your name?";
my $name = ucfirst(<STDIN>);
chomp $name;

if ($name ne "\n"){
    say STDOUT "Hello and welcome $name!";
} else {
    say STDERR "Please enter a name";
}
