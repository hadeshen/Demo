package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 14:35
 */
public class EqualsTest {
    private int weight;
    private String sex;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "熊猫{" +
                "体重=" + weight +
                ", 性别='" + sex + '\'' +
                '}';
    }
}
