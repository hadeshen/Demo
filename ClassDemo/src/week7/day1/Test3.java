package week7.day1;


import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author：陈林
 * @date：2020/9/15 9:39
 */
class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.getYear() +"年"+ birthday.getMonth() +"月"+ birthday.getDay() +"日"+
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        if (o instanceof Employee) {
            Employee employee = (Employee) o;
            return this.name.compareTo(employee.name);
        }return -1;
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;


    public MyDate(int year, int month, int day) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("药水哥", 29, new MyDate(1991, 12, 1));
        Employee employee2 = new Employee("肖战", 20, new MyDate(2000, 1, 1));
        Employee employee3 = new Employee("Giao哥", 22, new MyDate(1998, 3, 23));
        Employee employee4 = new Employee("孙笑川", 30, new MyDate(1990, 7, 15));
        Employee employee5 = new Employee("带篮子", 25, new MyDate(1995, 8, 20));
        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int year = new Integer(o1.getBirthday().getYear()).compareTo(new Integer(o2.getBirthday().getYear()));
                if (year != 0) {
                    return year;
                } else {
                    int month = new Integer(o1.getBirthday().getMonth()).compareTo(new Integer(o2.getBirthday().getMonth()));
                    if (month != 0) {
                        return month;
                    } else {
                        int day = new Integer(o1.getBirthday().getDay()).compareTo(new Integer(o2.getBirthday().getDay()));
                        return day;
                    }
                }
            }
        });
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        for (Object object : set) {
            System.out.println(object);
        }
    }
}
