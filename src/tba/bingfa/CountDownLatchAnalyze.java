package tba.bingfa;

import java.util.concurrent.CountDownLatch;

/**
 * Created by zhangdong on 3/1/18.
 */
public class CountDownLatchAnalyze {

    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);

        new Thread(){
            public void run() {
                try {
                    System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();

        new Thread(){
            public void run() {
                try {
                    System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();

        try {
            System.out.println("等待2个子线程执行完毕...");
            latch.await();
            System.out.println("2个子线程已经执行完毕");
            System.out.println("继续执行主线程");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

/*    public static void main(String[] args) throws InterruptedException{
        Thread parser1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1 finished");
            }
        });

        Thread parser2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2 finished");
            }
        });

        parser1.start();
        parser2.start();
        parser1.join();
        parser2.join();
        System.out.println("all finished");
    }*/

}

