package week3.classDemo;

/**
 * @author：陈林
 * @date：2020/8/21 16:45
 *
 * 时间类 XXXX年XX月XX日
 */
public class MyDate {
    private String year;
    private String month;
    private String day;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    /**
     * 打印时间
     * @return XXXX年XX月XX日
     */
    public String toDateString(){
        return getYear()+"年"+getMonth()+"月"+getDay()+"日";
    }
}
