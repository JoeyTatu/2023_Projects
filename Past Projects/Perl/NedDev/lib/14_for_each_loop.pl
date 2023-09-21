# By: NedDev
# Video Title: perl5 #16: Foreach Loop // For, Foreach
# Video URL: https://www.youtube.com/watch?v=snymyv-liEY

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

# use Extras::PrintLine;

# foreach INTERATOR (ARRAY) {
#     ...code
# }

my @animals = qw(gerbils hamsters mice rats);

# explicit iterator
foreach my $animal (@animals){
    say "foreach: $animal";
}

for my $animal (@animals){
    say "for: $animal";
}

# Implicit iterator

my @numbers = (1 .. 10);
foreach $_ (@numbers){
    say "Implitict foreach: $_";
}

foreach (@numbers){
    say "Implitict foreach without \$_: $_";
}