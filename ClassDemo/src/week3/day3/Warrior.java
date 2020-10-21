package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 8:57
 */
public class Warrior extends Role {
    public Warrior() {
        super(200);
    }

    @Override
    public void operate(Role role) {
        if (role instanceof Monster) {
            System.out.println("战士当前血量为："+getHealth());
            System.out.println("战士对九头蛇造成攻击");
            System.out.println("九头蛇血量为："+(new Monster().getHealth()-10));
        }else
        if (role instanceof Minister) {
            System.out.println("牧师使用药瓶为战士加血");
            System.out.println("战士当前血量为："+(getHealth()+10));
        }

    }
}
