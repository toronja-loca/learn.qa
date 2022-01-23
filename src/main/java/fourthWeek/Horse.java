package fourthWeek;

public class Horse extends Animal {
    public Horse(String animalName, String food, String location) {
        super(animalName, AnimalType.HORSE, food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("очень громко ржет");
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " радуется когда ему дают покушать " + getFood());
    }
}
