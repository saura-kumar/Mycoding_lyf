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
    $n=11;
    $flag=0;
    for($i=2; $i<$n; $i++){
        if($n% $i==0)
        $flag = 1;
        break;

    }
    if($flag ==1){
        echo "number is not prime";
    }
    else{
        echo "number is prime";
    }
    ?>
</body>
</html>