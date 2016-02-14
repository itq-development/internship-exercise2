namespace internship_exercise2.Models
{
    public class FuelConsumptionService : IFuelConsumptionService
    {
        public double Calculate(Car car)
        {
            var result = car.Fuel*100/car.JourneyDriven;
            return result;
        }
    }
}