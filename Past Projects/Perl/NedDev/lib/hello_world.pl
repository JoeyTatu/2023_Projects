use strict;
use warnings;
use diagnostics;
use v5.32.1;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

##### Intro #####

print("Hello world!\n");

