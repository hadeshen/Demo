package week6.day4;

/**
 * @author：陈林
 * @date：2020/9/10 14:35
 */
public class ThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        System.out.println("====");
    }
}
