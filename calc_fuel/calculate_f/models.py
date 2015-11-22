import decimal


class Calculator():
    def calculate(self, region, fuel, journey_driven):
        r=1
        if region == 'European': r=100
        decimal.getcontext().prec = 2
        return decimal.Decimal(fuel) / (decimal.Decimal(journey_driven) / decimal.Decimal(r))
