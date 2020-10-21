package week4.day1;

/**
 * @author：陈林
 * @date：2020/8/24 16:37
 */
public class ComparableCircle extends Circle implements ComparaObjct{

    @Override
    public int comparaTo(Object o) {
        if (o instanceof Circle) {
            ComparableCircle comparableCircle = (ComparableCircle) o;
            if (this.getRedius() == comparableCircle.getRedius()) {
                return 0;
            } else if (this.getRedius() > comparableCircle.getRedius()) {
                return 1;
            } else if (this.getRedius() < comparableCircle.getRedius()) {
                return -1;
            }
        }return 2;

    }

}
