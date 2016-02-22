<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="description" content="Aliaksandr Varabyou hobbies">
	<meta name="author" content="Aliaksandr Varabyou">

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
	<title>Aliaksandr Varabyou</title>
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Aliaxandr Varabyou</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<div class="form-group">
						<input type="text" placeholder="Email" class="form-control">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" class="form-control">
					</div>
					<button type="submit" class="btn btn-success">Sign in</button>
				</form>
			</div>
			<!--/.navbar-collapse -->
		</div>
	</nav>

	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container">
			<h1>Fuel calculator:</h1>
			<form style="max-width: 600px;" action="/fuel/calc/" method="get">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th style="vertical-align: inherit;">Inputs (European version)</th>
							<th style="text-align: center; vertical-align: inherit;">An average fuel consumption</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
								<input type="text" class="form-control" name="liters" required placeholder="fuel (in liters)">
							</td>
							<td rowspan="2" style="font-size: 18px; text-align: center; vertical-align: inherit;"><?= "{$this->fuelResult} l / 100 km."; ?></td>
						</tr>
						<tr>
							<td>
								<input type="text" class="form-control" name="kilometers" required placeholder="journey driven (in kilometers)">
							</td>
						</tr>
					</tbody>
				</table>
				<button type="submit" class="btn btn-default">Calculate</button>
			</form>
		</div>
	</div>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-4">
				<h2>My first simple MVC project</h2>
				<p>I've had created a simple calculator using MVC paradigm.</p>
				<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
			</div>
			<div class="col-md-4">
				<h2>JQuery DropDown menu</h2>
				<p>JQuery DropDown menu for another of my site was created.</p>
				<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
			</div>
			<div class="col-md-4">
				<h2>Successful SEO strategy</h2>
				<p>I've had created a successful SEO strategy for another of my site.</p>
				<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
			</div>
		</div>
		
		<hr>
		
		<footer>
			<p>&copy; 2016 Aliaxandr Varabyou</p>
		</footer>
		
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

</body>

</html>