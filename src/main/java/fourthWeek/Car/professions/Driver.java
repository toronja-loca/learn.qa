package fourthWeek.Car.professions;

public class Driver extends Person {
    int driverExperience;

    public Driver(String name, String lastName, int age, int driverExperience) {
        super(name, lastName, age);
        this.driverExperience = driverExperience;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverExperience=" + driverExperience +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
