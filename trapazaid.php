<?php
function area($a,$b,$h)
{
return(0.5*($a+$b)*$h);
}
$a = 3; $b = 4; $c = 6; $d = 5; $h=6;
echo ("a = ".$a. ",b = ".$b. ",c= ".$c. "d = ".$d. ",h = ".$h. "<br>");
echo "Area of trapezium is : = ".area($a,$b,$h)."<br>";
?>