# By: NedDev
# Video Title: perl5 #14: While Loops // WHILE, UNTIL
# Video URL: https://www.youtube.com/watch?v=9-MrzLgw1IM

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

# if (true){
#     do this    
# }

# while (true){
#     do this
# }

println "WHILE...";

my $tree = 10; # 100cm tall

while ($tree <= 100){
    println "My tree is $tree", "cm tall";
    $tree += 10;
}

println "Move on...";

println "\nUNTIL...";

my $new_tree = 10;

until ($new_tree >= 100){
    println "My new tree is $new_tree", "cm tall";
    $new_tree += 10;
}

println "Move on...";

