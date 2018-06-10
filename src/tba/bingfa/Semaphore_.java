package tba.bingfa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by dongzhang on 4/19/17.
 * <p>
 * Semaphore又称信号量，是操作系统中的一个概念，在Java并发编程中，信号量控制的是线程并发的数量
 * <p>
 * 其中参数permits就是允许同时运行的线程数目;
 */
public class Semaphore_ {
    private static final int THREAD_COUNT = 30;

    private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);

    private static Semaphore s = new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        s.acquire();
                        System.out.println("save data------");
                        TimeUnit.SECONDS.sleep(3);
                        s.release();
                    } catch (InterruptedException e) {
                    }
                }
            });
        }
        threadPool.shutdown();
    }
}

//向线程传递参数的3种基本方法
//1.通过构造方法传递数据
class MyThread1 extends Thread {
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        Thread thread = new MyThread1("world");
        thread.start();
    }
}

//2.通过变量和方法传递数据
class MyThread2 implements Runnable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.setName("world");
        Thread thread = new Thread(myThread);
        thread.start();
    }
}

//3.通过回调函数传递数据
class Data {
    public int value = 0;
}

class Work {
    public void process(Data data, Integer n1,Integer n2,Integer n3) {
        data.value = data.value+n1+n2+n3;
    }
}

class MyThread3 extends Thread {
    private Work work;

    public MyThread3(Work work) {
        this.work = work;
    }

    public void run() {
        java.util.Random random = new java.util.Random();
        Data data = new Data();
        int n1 = random.nextInt(1000);
        int n2 = random.nextInt(2000);
        int n3 = random.nextInt(3000);
        work.process(data, n1, n2, n3);   // 使用回调函数
        System.out.println(String.valueOf(n1) + "+" + String.valueOf(n2) + "+"
                + String.valueOf(n3) + "=" + data.value);
    }

    public static void main(String[] args) {
        Thread thread = new MyThread3(new Work());
        thread.start();
    }
}