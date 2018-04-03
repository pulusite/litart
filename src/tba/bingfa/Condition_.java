package tba.bingfa;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by dongzhang on 5/21/17.
 */
public class Condition_ {
    public static void main(String[] args) {
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition condition = reentrantLock.newCondition();

        new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLock.lock();
                System.out.println(Thread.currentThread().getName()+"拿到锁了");
                System.out.println(Thread.currentThread().getName()+"等待信号");
                try{
                    condition.await();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println();
            }
        }).start();
    }

}
