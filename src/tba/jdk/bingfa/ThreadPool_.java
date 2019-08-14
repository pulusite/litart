package tba.jdk.bingfa;

import java.util.concurrent.*;

/**
 * Created by zhangdong on 7/8/18.
 */
public class ThreadPool_ {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));

        //1.固定大小
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
//        fixedThreadPool.submit()
//        fixedThreadPool.execute();
        //2.可变大小的线程池
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//        cachedThreadPool.execute();
        //3.单任务线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//        singleThreadExecutor.execute();
        //4.延迟后运行或定期执行连接池
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
//        scheduledThreadPool.schedule();




        for(int i=0;i<20;i++){
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                    executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}

class MyTask implements Runnable {
    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
