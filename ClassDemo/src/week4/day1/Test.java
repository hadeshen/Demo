package week4.day1;

/**
 * @author：陈林
 * @date：2020/8/24 17:12
 */
public class Test {
    public static void main(String[] args) {
        ComparableCircle a = new ComparableCircle();
        a.setRedius(2);
        ComparableCircle b = new ComparableCircle();
        b.setRedius(2);
        System.out.println(a.comparaTo(b));
    }
}
