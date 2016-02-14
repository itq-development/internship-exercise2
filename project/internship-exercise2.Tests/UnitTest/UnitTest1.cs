using System;
using internship_exercise2.Models;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace internship_exercise2.Tests.UnitTest
{
    [TestClass]
    public class UnitTests
    {
        [TestMethod]
        public void Calculate_Fuel()
        {
            var car1 = new Car { Fuel = 10, JourneyDriven = 100 };
            var car2 = new Car { Fuel = 54, JourneyDriven = 79 };
            var fuelConsumption = new FuelConsumptionService();

            var result1 = fuelConsumption.Calculate(car1);
            var result2 = fuelConsumption.Calculate(car2);

            Assert.AreEqual(result1, 10);
            Assert.AreEqual(Math.Round(result2, 2), 68.35);
        }
    }
}
