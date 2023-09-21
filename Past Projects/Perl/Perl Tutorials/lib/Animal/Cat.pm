package Animal::Cat;

use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/Perl Tutorials/lib';

use strict;
use warnings;

sub new{
    my $class = shift;
    my $self = {
        name => shift,
        owner => shift
    };
    bless $self, $class;
    return $self;
}

sub getName {
    my ($self) = @_;
    return $self->{name};
}

sub setName{
    my ($self, $name) = @_;
    $self->{name} = $name if defined($name);
    return $self->{name};
}

sub getSound{
    my ($self) = @_;
    return $self->{name}, " says meow";
}

1;