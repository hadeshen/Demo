package week5.day2;

import java.util.Arrays;

/**
 * @author：陈林
 * @date：2020/9/2 20:29
 * 定义Dish菜品类，属性为菜品名name,价格price，在Test类中定义Dish[] dish数组，
 * 并初始化值，使用两种方式对该数组进行比较排序
 */
public class Dish implements Comparable{
    private String name;
    private double price;

    public Dish() {
    }

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        if (o instanceof Dish){
            Dish dish = (Dish)o;
            if (this.price>dish.price){
                return 1;
            }else if (this.price<dish.price){
                return -1;
            }else {
                return 0;
            }
//            return Double.compare(this.price,dish.price);
        }return 404;
    }




}
