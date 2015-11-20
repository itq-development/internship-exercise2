<?

$fuel = (double)$_POST['fuel'];
$driven = (double)$_POST['driven'];
$metrics = $_POST['metrics'] == 'US' ? 'US' : 'European';
$number = 0;


if(!empty($_POST))
{
	if($driven > 0 && $fuel > 0)
	{
		if($metrics != 'US')
		{
			$number = $fuel * 100 / $driven;
		}
		else
		{
			$number = $driven / $fuel;
		}

		$result = true;
	}
	else
	{
		$error = true;
	}
}

$t = new XTemplate('tpl/calculator.tpl');
$t->assign(array(
	'FUEL_LABEL' => $metrics == 'US' ? 'gallons' : 'liters',
	'DRIVEN_LABEL' => $metrics == 'US' ? 'miles' : 'km',
	'FUEL' => $fuel,
	'DRIVEN' => $driven ,
	'METRICS_EU' => $metrics == 'US' ? '' : 'checked="checked"' ,
	'METRICS_US' => $metrics == 'US' ? 'checked="checked"' : '',
	'RESULT_LABEL' => $metrics == 'US' ? 'miles per gallon' : 'l / 100 km',
	'RESULT' => number_format ($number , 2)
));
if($result)
{
	$t->parse('MAIN.RESULT');
}
if($error)
{
	$t->parse('MAIN.ERRORS');
}
$t->parse('MAIN');
$t->out('MAIN');