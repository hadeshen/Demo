package week3.day2;

/**
 * @author：陈林
 * @date：2020/8/18 9:06
 * 定义维护部员工类
 */
public class Maintainer extends Emloyee {
    public Maintainer(int id, String name) {
        super(id, name);
    }
}
class Network extends Maintainer{
    public Network(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("员工号为" + getId() + "的" + getName() + "员工，正在检查网络是否通畅");
    }
}