package fourthWeek;

public class Dog extends Animal {
    public Dog(String animalName, String food, String location) {
        super(animalName, AnimalType.DOG, food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalName() + " не дает спать ночью");
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " любит на завтрак " + getFood());
    }
}
