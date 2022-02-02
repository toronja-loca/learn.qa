package secondWeek;

import java.util.Scanner;

public class PrintAllNums {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
