# By: NedDev
# Video Title: perl5 #25: GREP FUNCTION // How to use grep in perl
# Video URL: https://www.youtube.com/watch?v=dclLZDNo2uY

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib './Perl/NedDev/lib';

# grep{evaluations}(list)

grep {say $_}(1 .. 7);

say "";

my @words = qw(Ned Dev Software Werewolf Dev);
my @grep_words = grep{$_ eq "Dev"}(@words);

foreach my $word (@grep_words){
    say $word;
}