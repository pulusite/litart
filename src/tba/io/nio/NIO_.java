package tba.io.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

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
 */
public class NIO_ {

}
