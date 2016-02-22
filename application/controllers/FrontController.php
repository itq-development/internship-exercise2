<?php
class FrontController {
	protected $_controller, $_action, $_params, $_body;
	static $_instance;

	public static function getInstance() {
		if(!(self::$_instance instanceof self)) 
			self::$_instance = new self();
		return self::$_instance;
	}
	private function __construct(){
		$request = $_SERVER['REQUEST_URI'];
		$splits = explode('/', trim($request,'/'));
		if($_SERVER['REQUEST_METHOD'] == GET){
			$count = 2;
			foreach($_GET as $key => $value){
				$splits[$count++] = $key;
				$splits[$count++] = $value;
			}
		}
		//Controller
		$this->_controller = !empty($splits[0]) ? ucfirst($splits[0]).'Controller' : 'FuelController';
		//Action
		$this->_action = !empty($splits[1]) ? $splits[1].'Action' : 'calcAction';
		//Parameters check
		if(!empty($splits[2])){
			$keys = $values = array();
				for($i=2, $cnt = count($splits); $i<$cnt; $i++){
					if($i % 2 == 0){
						//Even = key (parameter)
						$keys[] = $splits[$i];
					}else{
						//Parameter's value;
						$values[] = $splits[$i];
					}
				}
			$this->_params = array_combine($keys, $values);
		}
	}
	public function route() {
		if(class_exists($this->getController())) {
			$rc = new ReflectionClass($this->getController());
			if($rc->implementsInterface('IController')) {
				if($rc->hasMethod($this->getAction())) {
					$controller = $rc->newInstance();
					$method = $rc->getMethod($this->getAction());
					$method->invoke($controller);
				} else {
					throw new Exception("Action");
				}
			} else {
				throw new Exception("Interface");
			}
		} else {
			throw new Exception("Controller");
		}
	}
	public function getParams() {
		return $this->_params;
	}
	public function getController() {
		return $this->_controller;
	}
	public function getAction() {
		return $this->_action;
	}
	public function getBody() {
		return $this->_body;
	}
	public function setBody($body) {
		$this->_body = $body;
	}
}