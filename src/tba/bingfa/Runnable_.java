package tba.bingfa;

/**
 * Created by dongzhang on 6/2/17.
 */
public class Runnable_ implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"111");
    }

    public static void main(String[] args) {
        Runnable_ runnable = new Runnable_();
        new Thread(runnable,"线程1").start();
    }
}
