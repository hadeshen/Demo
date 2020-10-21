package week3.classDemo;

/**
 * @author：陈林
 * @date：2020/8/21
 * 实现按月计算工资的员工处理
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void earnings() {

    }
}
