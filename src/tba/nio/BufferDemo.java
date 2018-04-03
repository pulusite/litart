package cc.nio;

import java.nio.ByteBuffer;
/**
 * Created by dongzhang on 5/4/17.
 */
public class BufferDemo {
    public void test2(){
        String str = "abcde";
        ByteBuffer buf = ByteBuffer.allocate(1024);
        buf.put(str.getBytes());
    }

    public void test1(){
        String str  = "abcde";

        //1.分配一个指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);

        System.out.println("----allocate-----");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //2.利用put()存入数据到缓冲区
        buf.put(str.getBytes());

        System.out.println("----put-----");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //3.切换到读数据模式
        buf.flip();

        System.out.println("----flip-----");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //4.利用get()读取缓冲区中的数据
        byte[] dst = new byte[buf.limit()];
        buf.get(dst);
        System.out.println(new String(dst,0,dst.length));

        System.out.println("----get-----");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //5.rewind()：可重复读
        buf.rewind();

        System.out.println("----rewind-----");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //6.clear():清空缓冲区，但是缓冲区的数据依然存在，但处于"被遗忘"状态
        buf.clear();

        System.out.println("----clear-----");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        System.out.println(buf.get());
    }

    public static void main(String[] args) {
        BufferDemo bufferDemo = new BufferDemo();
        bufferDemo.test1();
    }
}
