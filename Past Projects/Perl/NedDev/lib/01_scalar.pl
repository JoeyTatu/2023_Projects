# By: NedDev
# Video Title: perl5 #3: Scalars (Part 1) Sigils & Scope
# Video URL: https://www.youtube.com/watch?v=ZFdbXJeZg0s
use strict;
use warnings;
use v5.32.1;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

# Custom print with new line sub

my $name = "Joey";
println $name;



