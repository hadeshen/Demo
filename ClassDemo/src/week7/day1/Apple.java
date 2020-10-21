package week7.day1;

/**
 * @author：陈林
 * @date：2020/9/14 10:45
 */
public class Apple<E>{
    private E weigth;

    public Apple() {
    }

    public Apple(E weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weigth=" + weigth +
                '}';
    }

    public E getWeigth() {
        return weigth;
    }

    public void setWeigth(E weigth) {
        this.weigth = weigth;
    }

    public static void main(String[] args) {
        Apple<String> a1 = new Apple<>();
        a1.setWeigth("500克");
        System.out.println(a1.toString());
        System.out.println("--------------------");
        Apple<Integer> a2 = new Apple<>();
        a2.setWeigth(500);
        System.out.println(a2.toString());
        Apple<Double> a3 = new Apple<>();
        a3.setWeigth(500.0);
        System.out.println(a3.toString());
    }
}
