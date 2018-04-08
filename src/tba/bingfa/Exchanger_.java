package tba.bingfa;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dongzhang on 4/19/17.
 */
public class Exchanger_ {
    private static final Exchanger<String> exgr = new Exchanger<String>();

    private static ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String a = "银行流水a";
                    exgr.exchange(a);
                } catch (InterruptedException e) {
                }
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String b = "银行流水b";
                    String a = exgr.exchange("b");
                } catch (InterruptedException e){

                }
            }
        });

        threadPool.shutdown();
    }
}
