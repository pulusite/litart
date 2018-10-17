package tba.jvm;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * Created by zhangdong on 2018/6/11.
 * 自定义类加载器步骤
 * <p>
 * 　　（1）继承ClassLoader    （2）重写findClass（）方法   （3）调用defineClass（）方法
 */
public class MyClassLoader extends ClassLoader {
    public MyClassLoader() {}

    public MyClassLoader(ClassLoader parent) {
        super(parent);
    }

    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File("D:/People.class");
        try {
            byte[] bytes = getClassBytes(file);
            //defineClass方法可以把二进制流字节组成的文件转换为一个java.lang.Class
            Class<?> c = this.defineClass(name, bytes, 0, bytes.length);
            return c;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    private byte[] getClassBytes(File file) throws Exception {
        // 这里要读入.class的字节，因此要使用字节流
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel wbc = Channels.newChannel(baos);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        while (true) {
            int i = fc.read(byteBuffer);
            if (i == 0 || i == -1)
                break;
            byteBuffer.flip();
            wbc.write(byteBuffer);
            byteBuffer.clear();
        }
        fis.close();
        return baos.toByteArray();
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, IllegalArgumentException {
        MyClassLoader mcl = new MyClassLoader();
        Class<?> clazz = Class.forName("People", true, mcl);
        Object obj = clazz.newInstance();
        People people=(People) obj;
        people.setName("Eric Zhang");
        System.out.println(people);
        System.out.println(obj);
        System.out.println(obj.getClass().getClassLoader());//打印出我们的自定义类加载器

    }
}
