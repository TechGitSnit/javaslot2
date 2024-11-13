<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <select name="opr" id="">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
</body>
</html>

<?php
if(isset($_POST['calcu']))
{
    $a=$_POST['n1'];
    $b=$_POST['n2'];

    $oper=$_POST['opr']

    $res;
    switch($oper)
    {
        case '+':
        $res=$a+$b;
        echo 'sum='.$res;
        break;
        case '-':
            $res=$a-$b;
            echo 'diff='.$res;
            break;

            default:
            echo "invali";
            
    }
}
?>