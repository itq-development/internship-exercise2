<?php
error_reporting( E_ERROR );

class Model
{
    public $l,$km;
    public function __construct()
    {
        $this->l = $_POST['l'];
        $this->km = $_POST['km'];
    }
}


class View
{
    private $model;
    private $controller;
    public $result;
    public function __construct($model,$controller) {
        $this->model = $model;
        $this->controller = $controller;
    }
    public function output(){
        return $result = round($this->model->l*100/$this->model->km, 2);
    }
}

class Controller
{
    private $model;
    public function __construct($model) {
        $this->model = $model;
    }
}

$model = new Model();
$controller = new Controller($model);
$view = new View($model,$controller);

$res = $view->output()." l / 100 km";

echo include("index.php");