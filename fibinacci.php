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
    $n1=1;
    $n2=0;
    for($i=0; $i<=15; $i++){
        echo "$n2" ."  ";
        $temp=$n1+$n2;
        $n1=$n2;
        $n2=$temp;
    }
    ?>
</body>
</html>