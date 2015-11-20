<!-- BEGIN: MAIN -->
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Fuel Calculator</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script>
    $(function(){
        $('.metrics').change(function() {
            $('.alert').hide();
            if (this.value == 'US') {
                $("#fuel-label").text("gallons");
                $("#km-label").text("miles");
            }
            else {
                $("#fuel-label").text("liters");
                $("#km-label").text("km");
            }
        });
    });
    </script>
  </head>
<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Fuel Calculator</a>
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
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>calculate<small> an average car fuel consumption </small></h1>   
      </div>
    </div>
    <div class="container">

        <!-- BEGIN: ERRORS -->
        <div class="alert alert-danger" role="alert">Please check your form!</div>
        <!-- END: ERRORS -->
        <!-- BEGIN: RESULT -->
        <div class="alert alert-success" role="alert"><strong>Result: </strong> {RESULT} {RESULT_LABEL}</div>
        <!-- END: RESULT -->


      <!-- Example row of columns -->
      <form method="POST" action="index.php">
        <div class="form-group">
          <label>Fuel</label>
          <div class="input-group">
            <input type="text" name="fuel" class="form-control" placeholder="Fuel" value="{FUEL}">
            <span class="input-group-addon" id="fuel-label">{FUEL_LABEL}</span>
          </div>
        </div>
        <div class="form-group">
          <label>Journey Driven</label>
          <div class="input-group">
            <input type="text" name="driven" class="form-control" placeholder="Journey Driven" value="{DRIVEN}">
            <span class="input-group-addon" id="km-label">{DRIVEN_LABEL}</span>
          </div>
        </div>
        <div>
          <strong> Metrics: </strong> 
          <label class="radio-inline">
            <input type="radio" name="metrics" class="metrics" value="European" {METRICS_EU}> European
          </label>
          <label class="radio-inline">
            <input type="radio" name="metrics" class="metrics" value="US" {METRICS_US}> US
          </label>
        </div>
        <div class="text-right">
          <button type="submit" class="btn btn-primary">Submit</button>
        </div>
      </form>

      <hr>

      <footer>
        <p>&copy; esclkm</p>
      </footer>
    </div> <!-- /container -->
  <body>

</html>
<!-- END: MAIN -->