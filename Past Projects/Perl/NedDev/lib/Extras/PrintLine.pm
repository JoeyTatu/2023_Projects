
package Extras::PrintLine;

use strict;
use warnings;
use feature 'say';
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';

require Exporter;
our @ISA = qw(Exporter);
our @EXPORT = qw(println);

sub println {
    my ($text) = @_;
    
    if (defined $text) {
        if ($text eq ""){
            say "";
        } else {
            my $output = join(" ", $text);
            say "$output";
        }
    }else {
        say "";;
    }
}

# sub printline {
#     say "";;
# }

1;  # End of module
