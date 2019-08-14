package tba.jdk.io.nio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zhangdong on 2018/4/17.
 * 总的来说java 中的IO 和NIO的区别主要有3点：

     IO是面向流的，NIO是面向缓冲的；
     IO是阻塞的，NIO是非阻塞的；
     IO是单线程的，NIO 是通过选择器来模拟多线程的；


    NIO在基础的IO流上发展处新的特点，分别是：
        内存映射技术: NIO中内存映射主要用到以下两个类： java.nio.MappedByteBuffer java.nio.channels.FileChannel
        字符及编码，
        非阻塞I/O和文件锁定。

 一个简单（标准）的NIO输入输出一般包含如下步骤：
 1. 从数据源获取通道
 2. 分配缓冲区
 3. 切换缓存区为写模式
 4. 从通道读取数据写入缓冲区
 5. 切换缓冲区为读模式
 6. 缓冲区数据写入通道中
 7. 关闭资源

 */
public class NIO_ {
    public static void main(String[] args) throws IOException {
        String filePath=System.getProperty("user.dir")+ File.separator+"resource/";

        RandomAccessFile formFile = new RandomAccessFile(filePath+"a.txt", "rw");
        RandomAccessFile toFile = new RandomAccessFile(filePath+"b.txt", "rw");

        //获取channel
        FileChannel fromChannel = formFile.getChannel();
        FileChannel toChannel = toFile.getChannel();

        // 定义缓冲大小
        int bufSize = 1024*4;

        // 定义缓冲
        ByteBuffer byteBuffer = ByteBuffer.allocate(bufSize);

        int len = 0;

        // 将数据从源channel写入到缓冲区
        while(  (len=fromChannel.read(byteBuffer)) !=-1 ){

            //切换到读模式
            byteBuffer.flip();

            //读取缓冲区数据写到目标channel
            toChannel.write(byteBuffer);

            // 清空缓冲
            byteBuffer.clear();
        }

        // 释放资源
        toChannel.close();
        fromChannel.close();
    }

    public void selector() throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        Selector selector = Selector.open();
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.configureBlocking(false);//设置为非阻塞方式
        ssc.socket().bind(new InetSocketAddress(8080));
        ssc.register(selector, SelectionKey.OP_ACCEPT);//注册监听的事件
        while (true) {
            Set selectedKeys = selector.selectedKeys();//取得所有key集合
            Iterator it = selectedKeys.iterator();
            while (it.hasNext()) {
                SelectionKey key = (SelectionKey) it.next();
                if ((key.readyOps() & SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT) {
                    ServerSocketChannel ssChannel = (ServerSocketChannel) key.channel();
                    SocketChannel sc = ssChannel.accept();//接受到服务端的请求
                    sc.configureBlocking(false);
                    sc.register(selector, SelectionKey.OP_READ);
                    it.remove();
                } else if
                        ((key.readyOps() & SelectionKey.OP_READ) == SelectionKey.OP_READ) {
                    SocketChannel sc = (SocketChannel) key.channel();
                    while (true) {
                        buffer.clear();
                        int n = sc.read(buffer);//读取数据
                        if (n <= 0) {
                            break;
                        }
                        buffer.flip();
                    }
                    it.remove();
                }
            }
        }
    }
}
