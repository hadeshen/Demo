package week5.day1;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author：陈林
 * @date：2020/9/1 15:13
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime of = LocalDateTime.of(2020,9,1,15,35);
        System.out.println(of);


    }
}
