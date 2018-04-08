package tba.mianshi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhangdong on 3/24/18.
 */
public class TwoThreadAlternateRun{
    private int tnum=1;//线程编号

    private ReentrantLock lock=new ReentrantLock();

    private Condition redCon=lock.newCondition();
    private Condition greenCon=lock.newCondition();

    public static void main(String[] args) {
        new TwoThreadAlternateRun().execute();
    }

    private void execute(){
        new Thread(new RedThread(),"red light").start();
        new Thread(new GreenThread(),"green light").start();
    }


    class RedThread implements Runnable{
        @Override
        public void run() {
            while (true){
                try{
                    lock.lock();
                    while (tnum!=1){
                        redCon.await();
                    }
                    System.out.println(Thread.currentThread().getName()+" is flashing...");
                    TimeUnit.SECONDS.sleep(1);
                    tnum=2;
                    greenCon.signal();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    class GreenThread implements Runnable{
        @Override
        public void run() {
            while (true){
                try{
                    lock.lock();
                    while (tnum!=2){
                        greenCon.await();
                    }
                    System.out.println(Thread.currentThread().getName()+" is flashing...");
                    TimeUnit.SECONDS.sleep(1);
                    tnum=1;
                    redCon.signal();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }

}
