package Animal::Lion;

use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/Perl Tutorials/lib';

use Animal::Cat;
use strict;
use warnings;

our @ISA = qw(Animal::Cat);

sub getSound{
    my ($self) = @_;
    return $self->{name}, " says Rowrrr"
}

1;