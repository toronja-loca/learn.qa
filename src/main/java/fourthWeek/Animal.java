package fourthWeek;

public class Animal {

    private String animalName;
    private String animalType;
    private String food;
    private String location;

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public Animal(String animalName, Enum animalType, String food, String location) {
        this.animalName = animalName;
        this.animalType = animalType.toString();
        this.food = food;
        this.location = location;
    }

    public void eat() {
        System.out.println("Животное кушает");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

    public void makeNoise() {
        System.out.println("Животное двигается");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
