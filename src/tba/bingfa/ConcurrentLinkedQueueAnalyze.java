package tba.bingfa;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangdong on 2018/3/30.
 * 非阻塞队列
 */
public class ConcurrentLinkedQueueAnalyze {
    private static ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
    private static int count = 2; // 线程个数
    //CountDownLatch，一个同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待。
    private static CountDownLatch latch = new CountDownLatch(count);

    public static void main(String[] args) throws InterruptedException {
        long timeStart = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ConcurrentLinkedQueueAnalyze.offer();
        for (int i = 0; i < count; i++) {
            executorService.submit(new Poll());
        }
        latch.await(); //使得主线程(main)阻塞直到latch.countDown()为零才继续执行
        System.out.println("cost time " + (System.currentTimeMillis() - timeStart) + "ms");
        executorService.shutdown();
//        executorService.invokeAll();
    }

    /**
     * 生产
     */
    public static void offer() {
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
    }
    /**
     * 消费
     */
    static class Poll implements Runnable {
        public void run() {
            // while (queue.size()>0) {
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
            latch.countDown();
        }
    }
}
