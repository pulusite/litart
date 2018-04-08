package tba.bingfa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 * Created by dongzhang on 6/3/17.
 */
public class Stop_Resume_Suspend {
    public static void main(String[] args) throws InterruptedException {
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Thread printThread = new Thread(new Runner(),"PrintThread");
        //设为守护线程
        printThread.setDaemon(true);
        //开始执行
        printThread.start();
        //休眠3秒，也就是PrintThread运行了3秒
        TimeUnit.SECONDS.sleep(3);
        //尝试暂停
        printThread.suspend();
        System.out.println("main thread suspend PrintThread at " + format.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
        //将PrintThread进行恢复，继续输出内容
        printThread.resume();
        System.out.println("main thread resume PrintThread at " + format.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
        //尝试终止PrintThread，停止输出内容
        printThread.stop();
        System.out.println("main thread stop PrintThread at " + format.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
    }

    /**
     * 该任务实现每隔一秒打印信息
     */
    static class Runner implements Runnable{
        public void run() {
            DateFormat format = new SimpleDateFormat("HH:mm:ss");
            while (true){
                System.out.println(Thread.currentThread().getName() + " run at " + format.format(new Date()));
                //休眠一秒后继续打印
                //SleepUtil.second(1);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
