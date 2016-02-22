<?php
class FuelCalc{

	public $fuelResult;
	public $litersCheck;
	public $kilometersCheck;
	
	public function calculate($liters, $kilometers) {
		if(empty($liters)){
			$this->litersCheck = "Please, enter amount of fuel (in liters)";
			$this->fuelResult = 0;
		}elseif(empty($kilometers)){
			$this->kilometersCheck = "Please, enter amount of kilometers";
			$this->fuelResult = 0;
		}else{
			$liters = abs((double)$liters);
			$kilometers = abs((double)$kilometers);
			$calc = $liters / ($kilometers / 100);
			$this->fuelResult = round($calc, 2);
		}
	}
	
	public function render($view) {
		ob_start();
		include('/' . $view);
		return ob_get_clean();
	}
}