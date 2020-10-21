package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 9:35
 */
public class Test {
    public static void main(String[] args) {
        Role warrior = new Warrior();
        Role minister = new Minister();
        warrior.operate(new Monster());
        minister.operate(new Monster());
}
}
