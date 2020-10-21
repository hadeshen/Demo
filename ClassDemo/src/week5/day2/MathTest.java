package week5.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author：陈林
 * @date：2020/9/2 19:21
 */
public class MathTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
        String date1 = sdf.format(date);
        System.out.println(date1);
        System.out.println(sdf.parse(date1));
        Date parse = sdf.parse("2020年09月02日  20时14分12秒");
        System.out.println(parse);


    }
}
