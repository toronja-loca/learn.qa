package firstWeek.division;

import java.util.Scanner;

public class division {
    public static void readInput() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        int result = a / b;
        System.out.println("Результат деления " + a + " на " + b + " равен " + result);
    }

    public static void main(String[] args) {
        readInput();
    }

}
