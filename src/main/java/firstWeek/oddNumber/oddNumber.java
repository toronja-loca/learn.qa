package firstWeek.oddNumber;

import java.util.Scanner;

public class oddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.close();

    }

    public static void isOddNum(int x){
        int result = x%2;
        if (result == 0){
            System.out.println("Это число четное");
        }
        else{
            System.out.println(result + "Это число нечетное");
        }
    }
}
