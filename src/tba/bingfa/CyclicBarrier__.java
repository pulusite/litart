package tba.bingfa;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by dongzhang on 4/19/17.
 */
public class CyclicBarrier__ {
    static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args) {
        new Thread(new Runnable(){
             public void run(){
                 try {
                     c.await();
                 } catch (Exception e){
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
}
