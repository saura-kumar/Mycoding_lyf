<?php
function roots ($a,$b,$c){
$d = $b*$b -4*$a*$c;
if ($d >= 0){
$x1 = (-$b + sqrt($d))/(2*$a);
$x2 = (-$b - sqrt($d))/(2*$a);
echo "Roots are : $x1, $x2 \n";
}
else 
{
$x1 = -$b/(2*$a);
$x2 = sqrt(-$d)/(2*$a);
echo "Roots are : ".$x1 ± $x2 i ."\n";
}
}
echo "Equation is ".x*x+5x+4=0."\n";
roots(1,5,4);
echo "\nEquation is ".x*x+4x+5=0. "\n";
roots(1,4,5);
?>
										