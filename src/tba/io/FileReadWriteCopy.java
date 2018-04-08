package tba.io;

import java.io.*;

/**
 * Created by zhangdong on 2018/4/8.
 */
public class FileReadWriteCopy {
    public static void main(String[] args) {
        FileReadWriteCopy file=new FileReadWriteCopy();
        String curPath=System.getProperty("user.dir")+File.separator+"resource";
        file.fileRead(curPath);

        file.fileWrite(curPath);
    }
    public void fileRead(String path){
        // 构建指定文件
        File file = new File(path+ File.separator + "io.txt");
        InputStream in = null;
        try {
            // 根据文件创建文件的输入流
            in = new FileInputStream(file);
            // 创建字节数组
            byte[] data = new byte[1024];
            // 读取内容，放到字节数组里面
            in.read(data);
            System.out.println(new String(data));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭输入流
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void fileWrite(String path){
        // 构建指定文件
        File file = new File(path + File.separator + "write.txt");
        OutputStream out = null;
        try {
            // 根据文件创建文件的输出流
            out = new FileOutputStream(file);
            String message = "我是好人。";
            // 把内容转换成字节数组
            byte[] data = message.getBytes();
            // 向文件写入内容
            out.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭输出流
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void fileCopy(String path){
        // 构建指定文件
        File file = new File("E:" + File.separator + "hello.txt");
        OutputStream out = null;
        try {
            // 根据文件创建文件的输出流
            out = new FileOutputStream(file);
            String message = "我是好人.。";
            // 把内容转换成字节数组
            byte[] data = message.getBytes();
            // 向文件写入内容
            out.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭输出流
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
