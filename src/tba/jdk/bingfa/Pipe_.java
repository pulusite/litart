package tba.jdk.bingfa;

import java.io.*;

/**
 * Created by dongzhang on 5/21/17.
 *
 * 其实PipedInputStream/PipedOutputStream相当于消费者和生产者机制。
 */
public class Pipe_ {
    public static void main(String[] args) throws Exception{
        PipedWriter out=new PipedWriter();
        PipedReader in=new PipedReader();
        out.connect(in);
        Thread printThread=new Thread(new Print(in),"PrintThread");
        printThread.start();
        int receive=0;
        try{
            while ((receive=System.in.read())!=-1){
                out.write(receive);
            }
        }finally {
            out.close();
        }
    }

    static class Print implements Runnable{
        private PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            int recive=0;
            try{
                while ((recive=in.read())!=-1){
                    System.out.println((char)recive);
                }
            }catch (Exception e){

            }
        }
    }
}
