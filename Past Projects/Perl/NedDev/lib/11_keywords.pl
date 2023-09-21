# By: NedDev
# Video Title: perl5 #13: die // Dealing with errors gracefully
# Video URL: https://www.youtube.com/watch?v=7Y89HQYg1sg

use strict;
use warnings;

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

use Extras::PrintLine;

my ($word) = @ARGV ; #or die "No values set for ARGV$!";

# if (scalar @ARGV == 0){
#     die "No values set for ARGV$!";
# } else {
#     println length($word);
# }

die "No values set for ARGV$!" if (scalar @ARGV == 0);

println length($word);
