package inheritancemethods.cars;

public class Jeep extends Car {
    private final double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity)
            throw new IllegalArgumentException("Extra tank capacity is less than extra fuel!");
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        double tank = getFuel() +extraFuel;
        if (-fuel > tank) throw new IllegalArgumentException("Not enough fuel available!");
        double extraTank = extraCapacity -extraFuel;
        if(-fuel < extraTank){
            extraFuel -= fuel;
        } else {
            fuel += extraFuel;
            extraFuel= 0;
            super.modifyFuelAmount(fuel);
        }
    }

    @Override
    public void drive(int km) {
        double fuelConsumption = -(km / 100.0 * getFuelRate());
        modifyFuelAmount(fuelConsumption);
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + extraCapacity - extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
