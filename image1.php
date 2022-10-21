<?php
$image=imagecreate(500,500);
$bg=imagecolorallocate($image,200,100,125);
$tx=imagecolorallocate($image,255,255,255);
imagestring($image,10,200,200,"PHP Image demo",$bg);
imagestring($image,10,500,100,"PHP Programming",$tx);
header("Content-Type :image/jpg");
imagejpeg($image);
imagedestroy($image);
?>