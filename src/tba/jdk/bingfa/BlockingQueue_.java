package tba.jdk.bingfa;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * Created by zhangdong on 5/27/18.
 */
public class BlockingQueue_ {

    public class Basket{
        BlockingQueue<String> backet=new LinkedBlockingQueue<>();

        public void produce() throws InterruptedException{
            backet.put("An apple");
        }

        public String consume() throws InterruptedException{
            return backet.take();
        }
    }

    class Producer implements Runnable{
        private String instance;
        private  Basket basket;

        public Producer(String instance,Basket basket){
            this.instance=instance;
            this.basket=basket;
        }

        @Override
        public void run() {
            try{
                while (true){
                    System.out.println("生产者准备生产苹果："+instance);
                    basket.produce();
                    System.out.println("!生产者生产苹果完毕："+instance);
                    Thread.sleep(300);
                }
            }catch (InterruptedException e){
                System.out.println("Productor Interrupted");
            }
        }
    }

    class Consumer implements Runnable{
        private String instance;
        private Basket basket;

        public Consumer(String instance,Basket basket){
            this.instance=instance;
            this.basket=basket;
        }
        @Override
        public void run() {
            try{
                while (true){
                    System.out.println("消费者准备消费苹果："+instance);
                    System.out.println(basket.consume());
                    System.out.println("!消费者消费苹果完毕："+instance);
                    Thread.sleep(300);
                }
            }catch (InterruptedException e){
                System.out.println("Consumer Interrupted");
            }
        }
    }

    @Test
    public void test(){
        Basket basket=new Basket();
        ExecutorService executorService= Executors.newCachedThreadPool();
        Producer producer1=new Producer("生产者001",basket);
        Producer producer2=new Producer("生产者002",basket);
        Consumer consumer=new Consumer("消费者001",basket);
        executorService.submit(producer1);
        executorService.submit(producer2);
        executorService.submit(consumer);
    }

}
