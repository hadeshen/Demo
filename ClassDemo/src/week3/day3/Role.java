package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 8:54
 */
public class Role {
    private int health;

    public Role(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void operate(Role role){
        System.out.println("当前角色的生命值为："+health);
    }
}
