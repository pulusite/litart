package tba.io.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zhangdong on 2018/4/17.
 */
public class FileChannel_ {
    public static void main(String[] args) throws Exception{
        System.out.println(FileChannel_.class.getClassLoader().getResource("").getPath());
        String curPath=FileChannel_.class.getClassLoader().getResource("").getPath()+"resource/";
        RandomAccessFile aFile = new RandomAccessFile("nio.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {

            System.out.println("Read " + bytesRead);
            buf.flip();

            while(buf.hasRemaining()){
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
