<?php
$image=imagecreate(400,400);
$bg=imagecolorallocate($image,200,100,125);
$tx=imagecolorallocate($image,255,255,255);
imagestring($image,10,100,200,"PHP Image demo",$bg);
imagestring($image,10,100,100,"PHP Programming",$tx);
header("Content-Type image/jpg");
imagejpeg($image);
imagedestroy($image);
?>