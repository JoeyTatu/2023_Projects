# By: NedDev
# Video Title: perl5 #22: SYSTEM CALLS // How to call a system command from perl
# Video URL: https://www.youtube.com/watch?v=iwYVpPl4AIk

use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib './Perl/NedDev/lib';

my $exit_code = system("cd \"C:/ProgramData/Microsoft/Windows Defender/Platform/4.18*/\" && MpCmdRun -SignatureUpdate");
unless ($exit_code){
    say "Completed sucessfully with no errors. Exit code $exit_code";
} else {
    say "Completed with errors. Exit code: $exit_code";
}

