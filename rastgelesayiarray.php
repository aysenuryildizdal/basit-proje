<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
$sayilar = array();
echo rand(0,20);
for($i=0; $i<20; $i++){
    $sayilar[] = rand(1,100);
}
print_r($sayilar);
    ?>

</body>
</html>