package tba.bingfa;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by dongzhang on 5/21/17.
 */
public class ReentrantLock_ {
    int a = 0;
    ReentrantLock lock = new ReentrantLock();

    public void writer(){
        lock.lock();
        try{
            a++;
        }finally {
            lock.unlock();
        }
    }

    public void reader(){
        lock.lock();
        try{
            int i = a;
            i++;
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {

    }
}
