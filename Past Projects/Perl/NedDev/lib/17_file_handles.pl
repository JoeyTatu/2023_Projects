# By: NedDev
# Video Title: perl5 #19: FILE HANDLES // How to read and write to a file in perl
# Video URL: https://www.youtube.com/watch?v=royP3J5k9_A

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib';


# Open a file
open(my $fh, "<", "./info.log");

# Read from file
# say <$fh>;

while (<$fh>){
    print $_;
}

# Write to a file
# '<'  - read only
# '>'  - create if doesn't exist OR overwrite
# '>>' - create if doesn't exist OR append to end of file

open(my $fh2, ">", "info2.log");
say $fh2 "New log file";

open(my $fh3, ">>", "./info_pancakes.log");
say $fh3 "\nI hope\n";

# Close the file handle
close($fh);
close($fh2);
close($fh3);
