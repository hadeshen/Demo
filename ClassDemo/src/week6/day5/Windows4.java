package week6.day5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author：陈林
 * @date：2020/9/14 14:54
 * 解决线程安全 lock
 */
class Windows2 implements Runnable {
    //100张票
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //synchronized同步监视器 使用代码块{} 俗称锁🔒
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":剩余：" + ticket + "张");
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }


        }
    }
}


public class Windows4 {
    public static void main(String[] args) {
        Windows1 windows1 = new Windows1();
        Thread thread1 = new Thread(windows1);
        Thread thread2 = new Thread(windows1);
        Thread thread3 = new Thread(windows1);
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
