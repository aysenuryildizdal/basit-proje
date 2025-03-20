<!DOCTYPE html>
<html lang = "en">
    <head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>cift sayi toplamı</title>
</head>
<body>
    <?php
    $sayac = 0;
    $toplam = 0;
    do{
        if($sayac % 2 == 0) $toplam += $sayac;
        $sayac++;
    }while($sayac<=100);
    echo "cift sayilarin toplami: " .$toplam;
    ?>
    </body>
    </html>
    