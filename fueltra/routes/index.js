var express = require('express');
var router = express.Router();

var unitsToCountAverage = 100;
var unitType = 'Kilometers'

/* GET home page. */
router.get('/', function (req, res, next) {
    res.render('index', {
        unitType: unitType,
        unitsNumber: unitsToCountAverage
    });
});

function fuelConsumptionPerUnit(fuel, unitsNumber) {
    return (fuel / unitsNumber);
}

router.post('/', function (req, res) {
    var fuel = req.body['fuel-value'];
    var length = req.body['journey-length'];

    res.render('average-consumption', {
        unitType: unitType,
        unitsNumber: unitsToCountAverage,
        consumptionAverage: fuelConsumptionPerUnit(fuel, length) * unitsToCountAverage
    });
    //console.log(fuelConsumptionPerUnit(fuel, length) * 100);
    //console.log(req.body);
});

module.exports = router;
