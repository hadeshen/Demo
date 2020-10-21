package week6.day4;

/**
 * @author：陈林
 * @date：2020/9/10 15:00
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2==0){
                        System.out.println(i);
                    }
                }
            }
        }.start();

    }
}
