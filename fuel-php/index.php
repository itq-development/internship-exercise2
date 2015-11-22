<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Average car fuel consumption</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
    <h1>Average car fuel consumption</h1>
    <form id="Calculator" action="mvc.php" method="post">
        <div class="row">
            <div class="col-xs-6">
                <strong>Inputs (European version)</strong>
            </div>
            <div class="col-xs-6">
                <strong>Output</strong>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-6">
                <input name="l" type="text" placeholder="fuel (in liters)" size="27">
            </div>
            <div class="col-xs-6">
                <input readonly name="result" type="text" size="27" value="<?php echo $res;?>">
            </div>
        </div>
        <div class="row">
            <div class="col-xs-6">
                <input name="km" type="text" placeholder="journey driven (in kilometers)" size="27">
            </div>
            <div class="col-xs-6"> </div>
        </div>
        <input class="button" id="count" type="submit" value="Calculate">
    </form>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>
