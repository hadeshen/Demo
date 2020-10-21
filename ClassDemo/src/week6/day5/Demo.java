package week6.day5;

/**
 * @author：陈林
 * @date：2020/9/12 9:49
 */
public class Demo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum+=i;
            if (i%3==0){
                System.out.println(i);
                break;
            }
        }
        System.out.println(sum);
//        int num = 50;
//        num = num++*2;
//        System.out.println(num);
    }
}
