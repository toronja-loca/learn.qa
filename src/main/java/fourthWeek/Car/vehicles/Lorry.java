package fourthWeek.Car.vehicles;

import fourthWeek.Car.details.Engine;
import fourthWeek.Car.professions.Driver;

public class Lorry extends Car {
    int maxWeight;

    public Lorry(String marka, String carClass, int weight, int maxWeight, Driver driver, Engine engine) {
        super(marka, "Lorry", weight, driver, engine);
        this.maxWeight = maxWeight;
    }
}
