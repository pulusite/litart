package tba.bingfa;

import java.util.Random;

/**
 * Created by zhangdong on 3/26/18.
 */


public class ThreadLocalAnalyze {
    private static ThreadLocal<Integer> xxxx = new ThreadLocal<Integer>();

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                public void run() {
                    int data = new Random().nextInt();
                    System.out.println(Thread.currentThread().getName()
                            + " has put data :" + data);
                    xxxx.set(data);

                    new A().get();
                    new B().get();
                }
            }).start();
        }
    }

    /**
     * 获取数据
     *
     * @author cary
     * @date 2015-8-24-下午6:05:27
     * @version 1.0.0
     */
    static class A {
        public void get() {
            int data = xxxx.get();
            System.out.println("A from " + Thread.currentThread().getName()
                    + " get data :" + data);

        }
    }

    /**
     * 获取数据
     *
     * @author cary
     * @date 2015-8-24-下午6:05:44
     * @version 1.0.0
     */
    static class B {
        public void get() {
            int data = xxxx.get();
            System.out.println("B from " + Thread.currentThread().getName()
                    + " get data :" + data);

        }
    }
}