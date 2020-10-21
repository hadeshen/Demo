package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 8:59
 */
public class Monster extends Role {
    public Monster() {
        super(200);
    }

    @Override
    public void operate(Role role){
        if (role instanceof Warrior){
            System.out.println("九头蛇当前血量为："+getHealth());
            System.out.println("九头蛇对战士造成攻击");
            System.out.println("战士血量为："+(new Warrior().getHealth()-10));
        }
        if (role instanceof Minister){
            System.out.println("九头蛇当前血量为："+getHealth());
            System.out.println("九头蛇误伤牧师");
            System.out.println("牧师血量为："+(new Minister().getHealth()-20));
        }
    }
}
