var counterConfiguration = require('../models/counterConfiguration.js');

exports.render = function(req, res) {
    res.render('index', {
        unitType: counterConfiguration.unitType,
        averageCountRange: counterConfiguration.averageCountRange
    });
};
