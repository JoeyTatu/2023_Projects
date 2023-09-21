# By: Derek Banas
# URL: https://www.youtube.com/watch?v=WEghIXs8F6c

use strict;
use warnings;
use diagnostics;
# use Cwd qw(getcwd);

use feature 'say';
use feature 'switch';
use v5.32.1;

# # ~~~~~~~~~ INTRO & SCALARS ~~~~~~~~~~

# print "Hello World\n";

# my $name = "Joey";
# my ($age, $street) = (37, '123 Main St');
# my $my_info = "$name lives at \"$street\"\n";

# $my_info = qq{$name is $age and lives on "$street"\n};

# print $my_info;

# my $bunch_of_info = <<"END";
# This is a 
# bunch of information
# on multiple lines
# END

# say $bunch_of_info;

# my $big_int = 18446744073709551615;

# # %c : Character
# # %s : String
# # %d : Decimal
# # %u : Unsigned integer
# # %f : FLoating Point (Decinal Notation)
# # %e : Floating Point (Scientific Notation)

# printf("%u \n", $big_int + 1);

# my $big_float = 0.1000000000000001;

# printf("%.16f \n", $big_float + 0.1000000000000001);

# my $first = 1;
# my $second = 2;
# say "$first $second";

# ($first, $second) = ($second, $first);
# say "$first $second";


# # ~~~~~~~~~ MATH FUNCTIONS ~~~~~~~~~~

# say "5 + 4 = ", 5 + 4;
# say "5 - 4 = ", 5 - 4;
# say "5 * 4 = ", 5 * 4;
# say "5 / 4 = ", 5 / 4;
# say "5 % 4 = ", 5 % 4;
# say "5 ** 4 = ", 5 ** 4;

# say "EXP 1 = ", exp 1;
# say "HEX 10 = ", hex 10;
# say "OCT 10 = ", oct 10;
# say "INT 6.45 = ", int(6.45);
# say "LOG 2 = ", log 2;
# say "Random between 0 - 10 = ", int(rand 11);
# say "SQRT 9 = ", sqrt 9;

# # += -= *= /=
# my $rand_num = 5;
# $rand_num += 1;

# say "Number: ", $rand_num;

# say "6++ = ", $rand_num++; # print number THEN add one
# say "++6 = ", ++$rand_num; # Add one THEN print number
# say "6-- = ", $rand_num--; # print number then minus one
# say "--6 = ", --$rand_num; # Minus one then print number

# say "3 + 2 * 5 = ", 3 + 2 * 5;
# say "(3 + 2) * 5 = ", (3 + 2) * 5;


# # ~~~~~~~~~ CONDITIONALS ~~~~~~~~~~

# # False is undef, 0, 0.0, "", "0"
# # == != < > <= >=
# # ! (not), &&, ||

# my $age = 80;
# my $is_not_intoxicated = 1; #True
# my $age_of_last_exam = 16;

# if($age < 16){
#     say "You cannot drive";
# } elsif(!$is_not_intoxicated){
#     say "You can't drive";
# } else {
#     say "You can drive";
# }

# if (($age >= 1) && ($age < 16)){
#     say "You cannot drive";
# } elsif (!$is_not_intoxicated){
#     say "You cannot drive";
# } elsif (($age >= 80) && (($age > 100) || (($age - $age_of_last_exam) > 5))){
#     say "You cannot drive";
# } else{
#     say "You can drive";
# }

# # eq : equal to
# # ne : not equal to
# # lt : less than
# # le : less than or equal to
# # gt : greater than
# # ge : greater than or equal to

# if ('a' eq 'b'){
#     say "a equals b";
# }else{
#     say "a does not equal to b";
# }

# unless(!$is_not_intoxicated){ # opposite of "if"
#     say "Get sober";
# }

# say (($age > 18) ? "Can vote" : "Cannot vote");


# # ~~~~~~~~~ LOOPING ~~~~~~~~~~

# for (my $i = 0; $i < 10; $i++){
#     say $i;
# }

# my $i = 1;

# while($i < 10){
#     if($i % 2 == 0){
#         $i++;
#         next; # similar to "continue"
#     }

#     if ($i == 7){
#         last; # similar to break;
#     }

#     say $i;
#     $i++;
# }

# my $lucky_number = 7;
# my $guess;

# do {
#     say ("Guess a number between 1 and 10");
#     $guess = <STDIN>;

# } while ($guess != $lucky_number);

# say ("You guessed 7!");

# my $age_old = 18;

# given($age_old){
#     when($_ > 16){
#         say "Drive";
#         continue;
#     }
#     when($_ > 17){
#         say "Go vote!";
#     }
#     default{
#         say "Nothing special";
#     }
# }


# # ~~~~~~~~~ STRINGS ~~~~~~~~~~

# my $long_string = "Random Long String";

# say "Length of String: ", length $long_string;

# printf("Long is at %d \n", index $long_string, "Long");

# printf("G is at %d \n", rindex $long_string, "g");

# $long_string = $long_string . ' isn\'t that long';

# say "Index 7 through 10: ", substr $long_string, 7, 4;

# my $animal = "animals";

# printf("Last character is %s\n", chop $animal);

# my $no_newline = "No Newline\n";
# chomp $no_newline;

# printf("Uppercase : %s \n", uc $long_string);
# printf("Lowercase : %s \n", lc $long_string);
# printf("1st uppercase: %s \n", ucfirst $long_string);

# $long_string =~ s/ /, /g;

# say $long_string;

# my $two_times = "What I said is " x 2;
# say $two_times;

# my @abcs = ('a' .. 'z'); # @ : arrays

# print join(", ", @abcs), "\n";

# my @nums = (1 .. 10);
# print join(", ", @nums), "\n";

# my $letter = 'c';
# say "Next letter: ", uc ++$letter;


# # ~~~~~~~~~ ARRAYS ~~~~~~~~~~

# my @primes = (2, 3, 5, 7, 11, 13, 17);
# my @my_info = ("Joey", "123 Main St", 37, 6.1);
# $my_info[4] = "Tatú";

# for my $info (@my_info){
#     say $info;
# }

# foreach my $num (@primes){
#     say $num;
# }

# for (@my_info){
#     say $_;
# }

# my @my_name = @my_info[0, 4];
# say @my_name;

# my $items = scalar @my_info;
# say $items;

# my ($f_name, $address, $how_old, $height, $l_name) = @my_info;

# say "$f_name $l_name";

# say "Popped value: ", pop @primes;
# say "Pushed value: ", push @primes, 17;
# say "First item: ", shift @primes;
# say "Unshifted item: ", unshift @primes, 2;

# print join(", ", @primes), "\n";

# say "Remove index 0 - 2: ", splice @primes, 0, 3;
# print join(", ", @primes), "\n";

# print join " ", ('list', 'of', 'words', "\n");

# my $customers = "Sue Sally Paul";
# my @cust_array = split / /, $customers;
# print join(", ", @cust_array, "\n");

# @cust_array = reverse @cust_array;
# @cust_array = sort @cust_array;
# @cust_array = reverse sort @cust_array;

# my @number_array = (1 .. 8);

# my @odds_array = grep {$_ % 2} @number_array;
# print join(", ", @odds_array), "\n";

# my @double_array = map {$_ * 2} @number_array;
# print join(", ", @double_array), "\n";


# # ~~~~~~~~~ HASHES ~~~~~~~~~~

# my %employees = (
#     "Sue" => 35,
#     "Paul" => 45,
#     "Sam" => 39
# );

# printf("Sue is %d \n", $employees{Sue});

# $employees{Frank} = 44;

# while(my ($key, $value)=each %employees){
#     print "$key is $value\n";
# }

# my @ages = @employees{"Sue", "Sam"};
# say @ages;

# my @hash_array = %employees;
# delete $employees{"Frank"};

# while(my ($key, $value)=each %employees){
#     print "$key is $value\n";
# }

# say ((exists $employees{'Sam'}) ? "Sam is here" : "No Sam");

# for my $key (keys %employees){
#     if($employees{$key} == 35){
#         say "Hi Sue!";
#     }
# }


# # ~~~~~~~~~ SUBROUTINES ~~~~~~~~~~

# sub get_random {
#     return int(rand 11);
# }

# say "Random number: ", get_random();

# sub get_random_max {
#     my ($max_num) = @_;

#     $max_num ||= 11;
#     return int(rand $max_num);
# }

# say ("Please specify the max random number: ");
# my $answer = <STDIN>;

# say "Random number with max: ", get_random_max(100), "\n";


# sub get_sum{
#     my ($num1, $num2) = @_;

#     $num1 ||= 1;
#     $num2 ||= 2;

#     return $num1 + $num2;
# }

# say ("Please enter the first number: ");
# my $number1 = <STDIN>;
# say ("Please enter the second number: ");
# my $number2 = <STDIN>;

# say "Sum of two numbers: ", get_sum(45, 98), "\n";


# sub sum_many {
#     my $sum = 0;
#     foreach my $val (@_){
#         $sum += $val;
#     }
#     return $sum;
# }
# say "Sum: ", sum_many(1, 2, 3, 4, 5);

# sub increment{
#     state $execute_total = 0;
#     $execute_total++;
#     say "Executed $execute_total times";
# }

# increment();
# increment();
# increment();
# increment();
# increment();


# sub double_array{
#     my @num_array = @_;
#     $_ *= 2 for @num_array;
#     return @num_array;
# }

# my @random_array = (1 .. 5);
# print join(", ", double_array(@random_array)), "\n";


# sub get_multiples{
#     my ($rand_num) = @_;
#     $rand_num ||= 1;
#     return $rand_num * 2, $rand_num * 3;
# }

# my ($dbl_num, $trip_num) = get_multiples(3);
# say "$dbl_num, $trip_num";


# sub factorial{
#     my ($num) = @_;
#     return 0 if $num <= 0;
#     return 1 if $num == 1;
#     return $num * factorial($num - 1);
# }

# say "Factorial 4 = ", factorial(4), "\n";


# # ~~~~~~~~~ FILE IO ~~~~~~~~~~

# my $emp_file = 'employees.txt';

# # my $cwd = getcwd();
# # print "Current working directory: $cwd\n";
# # print "File path: $emp_file\n";

# # $fh = file handler
# open my $fh, '<', $emp_file # < : Read-only
#     or die "Cannot open file: $_";

# while(my $info = <$fh>){
#     chomp($info);

#     my ($emp_name, $job, $id) = split /:/, $info;
    
#     print "$emp_name is a $job and their ID is $id \n";
# }

# close $fh or die "Couldn't close file: $_";


# open $fh, '>>', $emp_file # '>>' = append
#     or die "Cannot open file: $_";
# print $fh "Bob:Supervisor:126\n";
# close $fh or die "Couldn't close file: $_";


# open $fh, '+<', $emp_file # '+<' : Read and write'
#     or die "Cannot open file: $_";
# seek $fh, 0, 0;
# print $fh "Phil:Manager:127\n";
# close $fh or die "Couldn't close file: $_";


# # ~~~~~~~~~ OBJECT ORIENTATED PERL ~~~~~~~~~~

my $new_directory = 'C:/Users/Joey/RefresherTutorials2023/Perl/Perl Tutorials/lib';
chdir($new_directory) or die "Cannot change directory: $!";

use lib 'C:/Users/Joey/RefresherTutorials2023/Perl/Perl Tutorials/lib';

use Animal::Cat;

my $whiskers = new Animal::Cat("whiskers", "Joey");

say $whiskers->getName();

$whiskers->setName("Whiskers");

say $whiskers->getName();
say $whiskers->getSound();

use Animal::Lion;

my $king = new Animal::Lion("King", "None");

say $king->getName();
say $king->getSound();


