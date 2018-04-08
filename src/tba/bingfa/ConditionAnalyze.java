package tba.bingfa;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhangdong on 4/2/18.
 */
public class ConditionAnalyze {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void conditionWait() throws InterruptedException{
        lock.lock();
        try{
            condition.await();
        }finally {
            lock.unlock();
        }
    }

    public void conditionSingal(){
        lock.lock();
        try{
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
