package firstWeek.oddNumber;

public class oddNumber {
    public static void main(String[] args) {
        isOddNum(10);
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
