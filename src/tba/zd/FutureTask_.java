package tba.zd;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by zhangdong on 2018/6/11.
 */
public class FutureTask_ {
    public static void main(String[] args) throws Exception{
//        ExecutorService executorService= Executors.newCachedThreadPool();
        Task task=new Task();
        FutureTask<Integer> futureTask=new FutureTask<>(task);
//        executorService.submit(futureTask);
//        executorService.shutdown();

        Thread thread=new Thread(futureTask);
        thread.start();

        System.out.println("结果"+futureTask.get());
    }
}
