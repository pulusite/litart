package tba.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dongzhang on 5/21/17.
 *
 * 从控制台读取多字符输入
 */
public class BufferedReader_ {
    public static String read(String filename) throws Exception{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null){
            sb.append(s +"\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String args[]) throws Exception{
        char c;
        String str;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();//从控制台读取多字符输入
            str = br.readLine();//从控制台读取字符串
            System.out.println(c);
        } while(c != 'q');
        //控制台输出  注意：write() 方法不经常使用，因为 print() 和 println() 方法用起来更为方便。
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
        //

        System.out.println(System.getProperty("user.dir"));
        System.out.println(read(System.getProperty("user.dir")+"/src/cc/io/BufferedReader_.java"));
    }
}
