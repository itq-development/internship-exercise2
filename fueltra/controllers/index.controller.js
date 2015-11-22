var averageCountRange = 100;
var unitType = 'Kilometers';

exports.render = function(req, res) {
    res.render('index', {
        unitType: unitType,
        averageCountRange: averageCountRange
    });
};
