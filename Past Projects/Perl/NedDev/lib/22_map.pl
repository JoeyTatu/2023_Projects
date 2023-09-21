# By: NedDev
# Video Title: perl5 #24: MAP FUNCTION // How map an array and create a modified array
# Video URL: https://www.youtube.com/watch?v=5khkWGHPbfs

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib './Perl/NedDev/lib';

# map {item in list}(list)
my @numbers = (1 .. 9);
map {say $_}(@numbers);

say "";

my @old_numbers = (1 .. 5);
my @new_numbers = map{$_ + 1}(@old_numbers);

foreach my $num (@new_numbers){
    say $num;
}

say "";

my @cubed = map{$_ ** 3}(@old_numbers);
foreach my $num (@cubed){
    say $num;
}

