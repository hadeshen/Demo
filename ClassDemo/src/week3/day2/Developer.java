package week3.day2;

/**
 * @author：陈林
 * @date：2020/8/18 9:03
 * 定义研发部员工类
 */
public class Developer extends Emloyee {
    public Developer(int id, String name) {
        super(id, name);
    }
}

class JavaEE extends Developer {
    public JavaEE(int id, String name) {
        super(id, name);
    }


    @Override
    public void work() {
        System.out.println("员工号为" + getId() + "的" + getName() + "员工，正在研发淘宝网");
    }
}

