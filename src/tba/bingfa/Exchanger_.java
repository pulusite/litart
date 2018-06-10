package tba.bingfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangdong on 6/10/18.
 */
public class Exchanger_ {
    private static final Exchanger<String> exgr=new Exchanger<>();

    private static ExecutorService threadPool=Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        Exchanger<List<Integer>> exchanger = new Exchanger<>();
        new Consumer2(exchanger).start();
        new Producer2(exchanger).start();


        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String a="银行流水a";
                    exgr.exchange(a);
                }catch (InterruptedException e){}
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String b="银行流水";
                    String a=exgr.exchange("c");
                    System.out.println("a和b数据是否一致："+a.equals(b)+",a录入的是："+a+"，b录入的是："+ b);
                }catch (InterruptedException e){}
            }
        });

        threadPool.shutdown();
    }
}

class Producer2 extends Thread {
    List<Integer> listA = new ArrayList<>();
    Exchanger<List<Integer>> exchanger = null;
    public Producer2(Exchanger<List<Integer>> exchanger) {
        super();
        this.exchanger = exchanger;
    }
    @Override
    public void run() {
        Random rand = new Random();
        for(int i=0; i<1; i++) {
            listA.clear();
            listA.add(rand.nextInt(10000));
            listA.add(rand.nextInt(10000));
            listA.add(rand.nextInt(10000));
            listA.add(rand.nextInt(10000));
            listA.add(rand.nextInt(10000));
            try {
                listA = exchanger.exchange(listA);
                System.out.println("listA:"+listA);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Consumer2 extends Thread {
    List<Integer> listB = new ArrayList<>();
    Exchanger<List<Integer>> exchanger = null;
    public Consumer2(Exchanger<List<Integer>> exchanger) {
        super();
        this.exchanger = exchanger;
    }
    @Override
    public void run() {
        for(int i=0; i<1; i++) {
            try {
                listB = exchanger.exchange(listB);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("listB:"+listB.get(0)+", ");
            System.out.print(listB.get(1)+", ");
            System.out.print(listB.get(2)+", ");
            System.out.print(listB.get(3)+", ");
            System.out.println(listB.get(4)+", ");
        }
    }
}