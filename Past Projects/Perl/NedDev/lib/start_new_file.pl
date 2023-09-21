use strict;
use warnings;
use feature "say";

use FindBin qw($RealBin);
chdir($RealBin) or die "Cannot change directory: $!";
use lib './Perl/NedDev/lib';

my $new_file = "C:/Users/Joey/RefresherTutorials2023/Perl/NedDev/lib/24_grep_map_difference.pl";

open(my $fh, ">", $new_file) or die "Could not create new file$_";

say $fh "# By: NedDev
# Video Title: perl5 #26: GREP & MAP // What is the difference between grep and map?
# Video URL: https://www.youtube.com/watch?v=NocEcWAGwQc

use strict;
use warnings;
use feature \"say\";

use FindBin qw(\$RealBin);
chdir(\$RealBin) or die \"Cannot change directory: \$!\";
use lib './Perl/NedDev/lib';
";

close($fh);