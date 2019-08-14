package tba.jdk.bingfa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangdong on 6/10/18.
 */
public class Executors_ {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);//fixed
        ExecutorService executorServiceCachedThreadPool=Executors.newCachedThreadPool();//cached
        Executors.newScheduledThreadPool(2);//scheduled
        Executors.newSingleThreadExecutor();//single

        executorService.shutdown();

    }
}
