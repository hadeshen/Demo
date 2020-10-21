package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 9:00
 */
public class Minister extends Role {
    public Minister() {
        super(100);
    }

    @Override
    public void operate(Role role) {
        if (role instanceof Warrior){
            System.out.println("牧师使用回血技能为战士加血");
            System.out.println("战士的血量为："+(new Warrior().getHealth()+10));
        }
        if (role instanceof Monster){
            System.out.println("九头蛇误伤牧师");
            System.out.println("牧师的血量为："+(getHealth()-20));
        }
    }
}
