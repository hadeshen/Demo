package week2.day3;

public class Animal {
    private String name;
    private String sex;
    private int leg;
    private String call;

    Animal(int leg) {
        this.leg = leg;
    }

    Animal(String sex, int leg, String call, String name) {
        this.leg = leg;
        this.sex = sex;
        this.call = call;
        this.name = name;
        System.out.println(leg+"条腿的"+sex+name+"在"+call+"叫 ");
    }
}

