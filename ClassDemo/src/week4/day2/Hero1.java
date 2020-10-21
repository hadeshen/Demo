package week4.day2;

/**
 * @author：陈林
 * @date：2020/8/25 15:51
 */
public abstract class Hero1 {
    public static String name="亚索";
    public abstract void attack();

    public static void main(String[] args) {
        Hero1 a = new Hero1() {
            @Override
            public void attack() {
                System.out.println("踢了一脚");
            }
        };
        a.attack();
        class SomeHero extends Hero1{

            @Override
            public void attack() {
                System.out.println(name+"踢了一脚");
            }
        }
        SomeHero someHero = new SomeHero();
        someHero.attack();

    }
}
