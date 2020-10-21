package week7.day3;

import java.util.TreeSet;

/**
 * @author：陈林
 * @date：2020/9/16 16:55
 */
public class Test2 implements Comparable<Test2> {
    private String name;
    private int age;
    private float score;

    public Test2(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }


    @Override
    public int compareTo(Test2 o) {
        if (this.getScore() < o.getScore()) {
            return 1;
        } else if (this.getScore() > o.getScore()) {
            return -1;
        } else if (this.getScore() == o.getScore()) {
//            if (this.getAge() > o.getAge()) {
//                return 1;
//            }
            return -Integer.compare(this.getAge(),o.getAge());
        }
        return 404;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        TreeSet<Test2> test2s = new TreeSet<>();
        test2s.add(new Test2("liusan", 20, 91.0F));
        test2s.add(new Test2("lisi", 22, 90.0F));
        test2s.add(new Test2("wangwu", 20, 90.0F));
        test2s.add(new Test2("sunliu", 22, 100.0F));
        for (Test2 test2 : test2s) {
            System.out.println(test2);
        }


//        Test2[] arr = new Test2[4];
//        arr[0] = new Test2("liusan", 20, 91.0F);
//        arr[1] = new Test2("lisi", 22, 90.0F);
//        arr[2] = new Test2("wangwu", 20, 90.0F);
//        arr[3] = new Test2("sunliu", 22, 100.0F);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
