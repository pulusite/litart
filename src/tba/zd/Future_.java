package tba.zd;

import java.util.concurrent.*;

/**
 * Created by zhangdong on 2018/6/11.
 */
public class Future_ {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService= Executors.newCachedThreadPool();
        Task task=new Task();
        Future<Integer> future=executorService.submit(task);
        System.out.println(""+future.get());
    }
}
class Task implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("子进程在进行计算");
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
