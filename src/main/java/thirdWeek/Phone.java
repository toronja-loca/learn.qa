package thirdWeek;

public class Phone {
    long number;
    String model;
    double weight;

    @Override
    public String toString() {
        return "Phone " +
                "number= " + number +
                ", model='" + model + '\'' +
                ", weight= " + weight
                ;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    // вызов из конструктора с тремя параметрами конструктор с двумя
    public Phone(long number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public long getNumber() {
        System.out.println(number);
        return number;
    }

    public void reciveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void reciveCall(String name, long number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public void sendMessage(long number, long... vars) {
        System.out.println(number);
        System.out.println(vars);
    }

    public static void main(String[] args) {
        Phone first = new Phone(79999999999l, "Sony", 100.2);
        Phone second = new Phone(7988888888l, "Xiomi", 100.2);
        Phone third = new Phone(7977777777l, "iphone", 100.2);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        first.reciveCall("Mom", 7966666666l);
        first.getNumber();
        second.getNumber();
        third.getNumber();
    }
}
