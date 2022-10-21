<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
    $a = array(array(1,2,3),array(4,5,6),array(7,8,9));
    $b = array(array(7,8,9),array(4,5,6),array(1,2,3));
    $m = count($a);
    $n = count($a[2]);
    $p = count($b);
    $q = count($b[2]);

    echo "the first matrix :"."<br/>";
    for($raw = 0; $raw < $m; $raw++){
        for($col = 0; $col < $n; $col++)
        echo " ".$a[$raw][$col];
        echo "<br/>";

    }
    echo "the second matrix :"."<br/>";
    for($raw = 0; $raw < $p; $raw++){
        for($col = 0; $col < $q; $col++)
        echo " ".$b[$raw][$col];
        echo "<br/>";

    }
    echo "the transpose for the first matrix is :"."<br/>";
    for($raw = 0; $raw < $m; $raw++) {
        for($col = 0; $col < $n; $col++)
        echo " ".$a[$col][$raw];
        echo "<br/>";

    }
    echo "the addition of matrix is : "."<br/>";
    for($raw = 0; $raw < 3; $raw++){
        for($col = 0; $col < 3; $col++)
        echo  " ".$a[$raw][$col]+$b[$raw][$col]." ";
        echo "<br/>";

    }
    echo "the multiplication of matrix : <br/>";
    $result = array();
    for($i = 0; $i < $m; $i++){
        for($j = 0; $j < $q; $j++){
            $result[$i][$j] = 0;
            for($k = 0; $k < $n; $k++)
            $result[$i][$j] += $a[$i][$k] * $b[$k][$j];
        }
    }
    for($raw = 0; $raw < $m; $raw++){
        for($col = 0; $col < $q; $col++){
            echo " ".$result[$raw][$col];
        }
        echo "<br/>";
    }
?>


</body>
</html>