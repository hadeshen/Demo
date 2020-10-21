package week1.day04;

public class ClassTest03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6,7};
        int temp = 0;
        for (int i = 0; i < (a.length +1)/ 2; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
