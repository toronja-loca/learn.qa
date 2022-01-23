package firstWeek.oddNumber;

import java.util.Scanner;

public class oddNumber {
    public static void readInput(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.close();

        int result = x%2;
        if (result == 0){
            System.out.println("Это число четное");
        }
        else{
            System.out.println(result + "Это число нечетное");
        }

    }
    public static void main(String[] args) {
        readInput();
    }

}
