# By: NedDev
# Video Title: perl5 #9: IF Statements // ELSIF ELSE UNLESS
# Video URL: https://www.youtube.com/watch?v=uQcr8BkV2LA

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

# Basic IF
if (1){
    println "This is a true statement";
}

# IF ELSE
if (1){
    println "This is a true statement";
}else{
    println "This is a false statement";
}

# IF, ELSIF, ELSE
if (1){
    println "This is a true statement";
}elsif (0){
    println "This is a false statement";
}else {
    println -1;
}

# UNLESS - opposite of "if" statement
unless (1){
    println "UNLESS. This is a false statement";
} else{
     println "UNLESS. This is a true statement";
}

# One liners
println "Joey" if (1);
println "Bob" unless (0);

