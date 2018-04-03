package tba.bingfa;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by dongzhang on 4/19/17.
 */
public class CyclicBarrier_ {
    static CyclicBarrier c = new CyclicBarrier(2,new A());

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                } catch (Exception e) {
                }
                System.out.println(1);
            }
        }).start();

        try {
            c.await();
        } catch (Exception e) {
        }
        System.out.println(2);
    }

    static class A implements Runnable {
        public void run(){
            System.out.println(3);
        }
    }
}
