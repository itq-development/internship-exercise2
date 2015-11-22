var express = require('express');
var router = express.Router();

/* GET home page. */

router.get('/', function (req, res) {
    var indexController = require('../controllers/index.controller.js');
    indexController.render(req,res);
});

function getValuableMin(precision) {
    var result = 1;
    for (var i = 0; i < precision; i++) {
        result /= 10;
    }
    return result;
}

function roundResultTo2DecimalsIfPossible(result) {
    var roundingPrecision = 2;
    if (result < getValuableMin(roundingPrecision)) {
        return result.toFixed(20).match(/^-?\d*\.?0*\d{0,2}/)[0];
    } else {
        return result.toFixed(roundingPrecision);
    }
}

function getLastChar(string) {
    return string.charAt(string.length - 1);
}

function trimEndZeros(string) {
    while (getLastChar(string) == '0') {
        string = string.slice(0, -1);
        if (getLastChar(string) == '.') {
            string = string.slice(0, -1);
            return string;
        }
    }
    return string;
}

function trimEndZerosIfPossible(string) {
    if (getLastChar(string) == '0') {
        string = trimEndZeros(string);
    }
    return string;
}

function convertToHumanReadableString(number) {
    var result = number.toString();
    if (result.indexOf(".")) {
        return trimEndZerosIfPossible(result);
    } else {
        return result;
    }
}

function calculateAveragePerUnits(fuel, journeyLength, averageCountRange) {
    var result = fuel / journeyLength * averageCountRange;
    return roundResultTo2DecimalsIfPossible(result);
}

function presentFuelAverageConsumption(fuel, journeyLength, averageCountRange) {
    var roundedResult = calculateAveragePerUnits(fuel, journeyLength, averageCountRange);
    return convertToHumanReadableString(roundedResult);
}

router.post('/', function (req, res) {
    var fuel = req.body['fuel-value'];
    var journeyLength = req.body['journey-length'];

    res.render('average-consumption', {
        unitType: unitType,
        averageCountRange: averageCountRange,
        consumptionAverage: presentFuelAverageConsumption(fuel, journeyLength, averageCountRange)
    });
});

module.exports = router;
