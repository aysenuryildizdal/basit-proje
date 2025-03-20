<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $sayi = rand(1,100);
    echo "Sayi: " .$sayi .'<br>';
    echo " Tam Bolenleri: "; 
    for($i=1; $i<=$sayi; $i++) {
        if($sayi%$i==0);
        echo $i ." "; 
    }
  ?>
</body>
</html>