var express = require('express');
var router = express.Router();

/* GET home page. */

router.get('/', function (req, res) {
    var indexController = require('../controllers/indexController.js');
    indexController.render(req,res);
});

router.post('/', function (req, res) {
    var resultController = require('../controllers/resultController.js');
    resultController.render(req,res);
});

module.exports = router;
