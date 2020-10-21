package week4.day2;

/**
 * @author：陈林
 * @date：2020/8/25 14:29
 */
public class Hero {
    private static String name = "亚索";
    private int armor;
    private int moveSpeed;
    private int magicResistance;
    private int attack;

    /**
     * 内部类
     */
    static class Battale {
        //击杀数
        private int kill;
        //死亡数
        private int death;
        //辅助数
        private int assistant;

        public void lengedary(int kill) {
            if (kill >= 8) {
                System.out.println(name + "超神了");
            } else {
                System.out.println(name + "离超神还差一点，去团战混人头");
            }
        }
    }

    static class EnemyCrystal {
        int health = 100;

        public void checklfVictory() {
            if (health <= 0) {
                System.out.println("敌方水晶被摧毁，胜利");
            } else {
                System.out.println("加快推塔速度");
            }
        }
    }

    public int hitEnemyCrystal(EnemyCrystal e) {
        while (e.health <= 0) {

            e.health -= 10;
            return e.health;
        }
        return 0;

    }

    public static void main(String[] args) {
        Battale yasuo = new Battale();
        //外部类.内部类 对象名 = new 外部类.内部类（）
        EnemyCrystal a = new EnemyCrystal();
        Hero hero = new Hero();
        hero.hitEnemyCrystal(a);
        a.checklfVictory();
    }
}
