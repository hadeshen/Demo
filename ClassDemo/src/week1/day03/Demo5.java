package week1.day03;

public class Demo5 {
    public static void main(String[] args) {
//        int n=512;
//        for(int i = 31;i >= 0; i--) {
//            System.out.print(n >>> i & 1);
//        }
        int n = 128;
        String str = "";
        while (n != 0) {
            str = n % 2 + str;
            n = n / 2;
        }
        System.out.println(str);
    }
}
