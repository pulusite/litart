package tba.mianshi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class WaitNotifyPC {
    //生产者
    static class Producer extends Thread{
        private List<String> storage;//生产者仓库
        public Producer(List<String> storage) {
            this.storage = storage;
        }
        public void run(){
            //生产者每隔1s生产1~100消息
            long oldTime = System.currentTimeMillis();
            while(true){
                synchronized(storage){
                    if (System.currentTimeMillis() - oldTime >= 1000) {
                        oldTime = System.currentTimeMillis();
                        int size = (int)(Math.random()*100) + 1;
                        for (int i = 0; i < size; i++) {
                            String msg = UUID.randomUUID().toString();
                            storage.add(msg);
                        }
                        System.out.println("线程"+this.getName()+"生产消息"+size+"条");
                        storage.notify();
                    }
                }
            }
        }
    }

    //消费者
    static class Consumer extends Thread{
        private List<String> storage;//仓库
        public Consumer(List<String> storage) {
            this.storage = storage;
        }
        public void run(){
            while(true){
                synchronized(storage){
                    //消费者去仓库拿消息的时候，如果发现仓库数据为空，则等待
                    if (storage.isEmpty()) {
                        try {
                            storage.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int size = storage.size();
                    for (int i = size - 1; i >= 0; i--) {
                        storage.remove(i);
                    }
                    System.out.println("线程"+this.getName()+"成功消费"+size+"条消息");
                }
            }
        }
    }

    //仓库类
    static class Storage {

        private List<String> storage;//生产者和消费者共享的仓库
        public Storage() {
            storage = new ArrayList<String>();
        }
        public List<String> getStorage() {
            return storage;
        }
        public void setStorage(List<String> storage) {
            this.storage = storage;
        }
    }

//    @Test
//    public void test(){
//        Storage storage = new Storage();
//        Producer producer = new Producer(storage.getStorage());
//        Consumer consumer = new Consumer(storage.getStorage());
//        producer.start();
//        consumer.start();
//    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        Producer producer = new Producer(storage.getStorage());
        Consumer consumer = new Consumer(storage.getStorage());
        producer.start();
        consumer.start();
    }
}
