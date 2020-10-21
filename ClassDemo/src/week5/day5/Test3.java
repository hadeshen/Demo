package week5.day5;

/**
 * @author：陈林
 * @date：2020/9/4 10:30
 * 创建星期类枚举值
 */
enum week{
    /**
     * 星期枚举值
     */
    Monday ("星期一","学习"),
    Tuesday("星期二","学习"),
    Wednesday("星期三","学习"),
    Thursday("星期四","学习"),
    Friday("星期五","学习"),
    Saturday("星期六","学习"),
    Sunday("星期日","学习");
    private final String week;
    private final String plan;

    week(String week, String plan) {
        this.week = week;
        this.plan = plan;
    }

    public String getWeek() {
        return week;
    }

    public String getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return "week{" +
                "week='" + week + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }
}
public class Test3 {
    public static void main(String[] args) {
        System.out.println(week.Friday.toString());
    }
}
