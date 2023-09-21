# By: NedDev
# perl5 #5: Booleans // Does perl5 have them?
# Video URL: https://www.youtube.com/watch?v=IJDm7twpr54

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

# False: undef, 0, "0", ""
# Everything else is True

# '0' is false, '00' is true
# 'true' is true, 'false' is true (both are strings, strings are true

my $statement = "false";

if ($statement){
    println "True";
}else{
    println "False";
}