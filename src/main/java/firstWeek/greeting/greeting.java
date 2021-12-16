package firstWeek.greeting;

public class greeting {
    public static void main(String[] args) {
        greeting(24, "Carlos");
    }

    public static void greeting(int hours, String name){
        if(hours > 5 & hours < 12){
            System.out.printf("Доброе утро, %s", name);
        }
        else if(hours > 12 & hours < 16){
            System.out.printf("Добрый день, %s", name);
        }
        else if(hours >16 & hours < 23){
            System.out.printf("Добрый вечер, %s", name);
        }
        else{
            System.out.printf("Доброй ночи, %s", name);
        }
    }
}
