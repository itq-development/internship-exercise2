var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function (req, res, next) {
    res.render('index', {
        title: 'Fueltra: fuel tracker',
        purpose: 'Know how much fuel you spend per every 100',
        units: 'kilometers'
    });
});

function fuelConsumptionPerUnit(fuel, length) {
    return (fuel / length);
}

router.post('/', function (req, res) {
    var fuel = req.body.fuel;
    var length = req.body.length
    console.log(fuelConsumptionPerUnit(fuel, length) * 100);
});

module.exports = router;
