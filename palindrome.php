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
    function palindrom($string){
        if(strrev($string == $string)){
            return 1;
        }
        else{
            return 0;
        }
    }
    $orignal ="madam";
    if(palindrom($orignal)){
        echo "palindrom";
    }
    else{
        echo "not a palindrom";
    }
    ?>
</body>
</html>