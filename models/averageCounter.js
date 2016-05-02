var averageCounter = {
    findFuelPerLengthAverageUserFriendly: findFuelPerLengthAverageUserFriendly
};

module.exports = averageCounter;

function findFuelPerLengthAverageUserFriendly(fuel, journeyLength, averageCountRange) {
    var average = fuel / journeyLength * averageCountRange;
    return roundTo2DecimalsIfPossible(average);
}

function getValuableMin(precision) {
    var result = 1;
    for (var i = 0; i < precision; i++) {
        result /= 10;
    }
    return result;
}

function roundTo2DecimalsIfPossible(result) {
    var roundingPrecision = 2;
    if (result < getValuableMin(roundingPrecision)) {
        return result.toFixed(20).match(/^-?\d*\.?0*[1-9]{0,2}/)[0]; //show no more than 2 decimals other than zeros
    }
    return result.toFixed(roundingPrecision);
}