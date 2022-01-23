package fourthWeek.Car.vehicles;

import fourthWeek.Car.details.Engine;
import fourthWeek.Car.professions.Driver;

public class SportCar extends Car {
    int maxSpeed;

    public SportCar(String marka, String carClass, int weight, int maxSpeed, Driver driver, Engine engine) {
        super(marka, "SportCar", weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
