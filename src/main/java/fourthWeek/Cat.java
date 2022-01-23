package fourthWeek;

import com.sun.jdi.Value;

public class Cat extends Animal {
    public Cat(String animalName, String food, String location) {
        super(animalName, AnimalType.CAT, food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalName() + " любит играть с шариками ");
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " обожает кушать" + getFood());
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", "Whiskas", "Baker street");
        System.out.println(cat);
        cat.makeNoise();
    }
}
