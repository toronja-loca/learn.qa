package fourthWeek;

import java.util.List;

public class Veterinar {

    public void treatAnimal(Animal animal) {
//        прием на лечение
        System.out.println("принял " + animal.getAnimalType() + " по кличке "
                + animal.getAnimalName() + " он кушал " + animal.getFood() + " его привезли из " + animal.getLocation());
    }


    public static void main(String[] args) {
        Veterinar veterinar = new Veterinar();
//        список имеющихся животных
        List<Animal> animals = List.of(
                new Cat("Kuzia", "Fish", "cat house"),
                new Dog("Barbos", "Soup", "dog house 6"),
                new Horse("Buran", "Carrot", "horse village"));

//        животные которые поступили на лечение через цикл for
        for (int i = 0; i < animals.size(); i++) {
            veterinar.treatAnimal(animals.get(i));
        }

    }

}
