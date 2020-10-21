package week3.day5;

/**
 * @author：陈林
 * @date：2020/8/21 15:27
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary,double bonus) {
        super(name, id, salary);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public String work() {
        return "姓名："+getName()+"\n"+
                "编号："+getId()+"\n"+
                "工资："+getSalary()+"\n"+
                "奖金："+getBonus();
    }

    public static void main(String[] args) {
        Manager manager = new Manager("马云",1,100,50);
        System.out.println(manager.work());
    }


}
