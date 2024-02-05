package java_base;
import java.util.Calendar;

public class Time {
    public static void main(String[] args){
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                if (hour >= 4 && hour < 12) {
                    System.out.println("Доброе утро!");
                } else if (hour >= 12 && hour < 18) {
                    System.out.println("Добрый день!");
                } else if (hour >= 18 && hour < 23) {
                    System.out.println("Добрый вечер!");
                } else {
                    System.out.println("Доброй ночер!");
                }
            }
}
