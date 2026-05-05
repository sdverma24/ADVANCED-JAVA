print "Enter a number: ";
$num = <STDIN>;
chomp($num);

$original = $num;
$digits = length($num);
$sum = 0;

while ($num > 0) {
    $digit = $num % 10;          # last digit
    $sum += $digit ** $digits;   # power
    $num = int($num / 10);       # remove last digit
}

if ($sum == $original) {
    print "Armstrong Number\n";
} else {
    print "Not an Armstrong Number\n";
}