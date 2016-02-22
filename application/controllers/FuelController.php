<?php
class FuelController implements IController {
	public function calcAction() {
		$fc = FrontController::getInstance();
		//Add params
		$params = $fc->getParams();
		$model = new FuelCalc();
		// Call calculate model method
		$model->calculate($params['liters'], $params['kilometers']);
		// Render view
		$result = $model->render('../views/fuel.php');
		$fc->setBody($result);
	}
}