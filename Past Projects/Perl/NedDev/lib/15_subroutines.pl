# By: NedDev
# Video Title: perl5 #17: subroutines // perl functions
# Video URL: https://www.youtube.com/watch?v=39GqaBKpiIw

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';
use utf8;

binmode(STDOUT, ":utf8");

# Structure of subroutines
sub routine_name {
    # Code goes here
    say "Joey";
}

# routine_name();

# Older code uses '&' to run a subroutine.
# Not recommended anymore, more for understand older code

# &routine_name();

# Method 1
sub make_uppercase {
    my ($string) = @_;
    say uc $string;
}

# Method 2
sub make_uppercase2 {
    my $string = shift @_;
    say uc $string;
}

# make_uppercase("joey");
# make_uppercase2("joey");

sub printHashValues {
    my (%hash) = @_;

    for my $key (keys %hash){
        say $hash{$key};
    }
}

my %names = (
    one => "Joey",
    two => "Charlie",
    three => "Peter",
    four => "Tatú",
);

# printHashValues(%names);

sub sum_array {
    my (@array) = @_;

    my $sub_total = 0;

    for my $iter (@array){
        $sub_total += $iter;
    }

    return $sub_total;
}

my @numbers = (1 .. 1000);
print sum_array(@numbers);






