package firstWeek.greeting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class greeting {
    public static void main(String[] args) throws ParseException {
        greeting("05", "01", "00", "Carlos");
        greeting("11", "59", "59", "Carlos");
        greeting("12", "01", "00", "Carlos");
        greeting("15", "59", "59", "Carlos");
        greeting("16", "01", "00", "Carlos");
        greeting("23", "59", "00", "Carlos");
    }

    public static void greeting(String h, String m, String s, String name) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String setTime = h + ":" + m+ ":" + s;
        Date currentTime = sdf.parse(setTime);
        Date morning = sdf.parse("05:00:00");
        Date day = sdf.parse("12:00:00");
        Date evening = sdf.parse("16:00:00");
        Date night = sdf.parse("23:00:00");

        if(currentTime.after(morning) & currentTime.before(day)){
            System.out.printf("Доброе утро, %s", name);
        }
        else if(currentTime.after(day) & currentTime.before(evening)){
            System.out.printf("Добрый день, %s", name);
        }
        else if(currentTime.after(evening) & currentTime.before(night)){
            System.out.printf("Добрый вечер, %s", name);
        }
        else{
            System.out.printf("Доброй ночи, %s", name);
        }
    }
}
