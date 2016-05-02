var fuelAverageCounter = require('../models/averageCounter.js');
var counterConfiguration = require('../models/counterConfiguration.js');

exports.render = function (req, res) {
    var fuel = req.body['fuel-value'];
    var journeyLength = req.body['journey-length'];
    var averageConsumption = fuelAverageCounter
        .findFuelPerLengthAverageUserFriendly(fuel, journeyLength, counterConfiguration.averageCountRange);

    res.render('result', {
        unitType: counterConfiguration.unitType,
        averageCountRange: counterConfiguration.averageCountRange,
        consumptionAverage: averageConsumption
    });
};