package week7.day1;

/**
 * @author：陈林
 * @date：2020/9/14 16:37
 * 生产者与消费者
 */

/**
 * 生产者
 */
class Produce implements Runnable {
    private Middleman middleman;

    public Produce(Middleman middleman) {
        this.middleman = middleman;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":生产产品。。。");
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            middleman.produce();
        }
    }
}

/**
 * 消费者
 */
class Consumer implements Runnable {
    private Middleman middleman;

    public Consumer(Middleman middleman) {
        this.middleman = middleman;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "消费者消费产品");
        while (true) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            middleman.consumer();
        }
    }
}

/**
 * 中间者
 */
class Middleman {
    private int count = 0;

    public synchronized void produce() {
        if (count<20){
            count++;
            System.out.println(Thread.currentThread().getName()+":生产产品"+count);
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumer() {
        if (count>0){
            System.out.println(Thread.currentThread().getName()+":消费产品"+count);
            count--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Middleman middleman = new Middleman();
        Produce p1 = new Produce(middleman);
        Thread thread1 = new Thread(p1);
        thread1.setName("生产者1");
        Produce p2 = new Produce(middleman);
        Thread thread2 = new Thread(p2);
        thread2.setName("生产者2");
        Consumer c1 = new Consumer(middleman);
        Thread thread3 = new Thread(c1);
        thread3.setName("消费者");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
