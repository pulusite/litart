package tba.bingfa;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by dongzhang on 6/3/17.
 */
public class Callable_Future implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }

    public static void main(String[] args) {
        Callable_Future callable_future = new Callable_Future();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable_future);
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
            if (i == 2){
                new Thread(futureTask,"有返回值的线程").start();
            }
        }
        try{
            System.out.println("子线程的返回值:" + futureTask.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
