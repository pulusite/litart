package tba.bingfa;

/**
 * Created by dongzhang on 4/29/17.
 */
public class Volatile_ {
    volatile long vl = 0L;

    public void set(long l){
        vl = 1;
    }

    public void getAndIncrement(){
        vl++;
    }

    public long get(){
        return vl;
    }
}

class VolatileDemoe{
    long vl = 0L;

    public synchronized void set(long l){
        vl=1;
    }

    public void getAndIncrement(){
        long temp = get();
        temp+=1L;
        set(temp);
    }

    public synchronized long get(){
        return vl;
    }
}
