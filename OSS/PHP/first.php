<html>
<body>

<?php

echo "<h2>--- NUMERIC ARRAY + FOREACH ---</h2>";

$numbers = array(1, 2, 3, 4, 5);

foreach($numbers as $value){
    echo "Value: $value <br>";
}

echo "<h2>--- BREAK STATEMENT ---</h2>";

$i = 0;

while($i < 10){
    $i++;
    if($i == 4){
        break;
    }
    echo "i = $i <br>";
}

echo "Loop stopped at i = $i <br>";

echo "<h2>--- CONTINUE STATEMENT ---</h2>";

$array = array(1,2,3,4,5);

foreach($array as $value){
    if($value == 3){
        continue;
    }
    echo "Value: $value <br>";
}

echo "<h2>--- ASSOCIATIVE ARRAY ---</h2>";

$salaries = array(
    "Rahul" => 5000,
    "Amit" => 6000,
    "Neha" => 7000
);

foreach($salaries as $name => $salary){
    echo "$name earns $salary <br>";
}

echo "<h2>--- MULTIDIMENSIONAL ARRAY ---</h2>";

$marks = array(
    "Rahul" => array("Math" => 90, "Science" => 85),
    "Amit" => array("Math" => 80, "Science" => 88),
    "Neha" => array("Math" => 95, "Science" => 92)
);

foreach($marks as $student => $subjects){
    echo "<b>$student</b><br>";
    
    foreach($subjects as $subject => $mark){
        echo "$subject : $mark <br>";
    }
}

echo "<h2>--- STRINGS ---</h2>";

$name = "John";

// Single quotes (no variable processing)
echo 'Hello $name <br>';

// Double quotes (variable works)
echo "Hello $name <br>";

// Concatenation
$str1 = "Hello";
$str2 = "World";
echo $str1 . " " . $str2 . "<br>";

// String length
echo "Length: " . strlen("Hello World") . "<br>";

// String position
echo "Position of 'World': " . strpos("Hello World", "World") . "<br>";

echo "<h2>--- EXTRA: BREAK + CONTINUE TOGETHER ---</h2>";

for($i = 1; $i <= 10; $i++){

    if($i == 3){
        continue;
    }

    if($i == 7){
        break;
    }

    echo "Number: $i <br>";
}

?>

</body>
</html>