package tba.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dongzhang on 5/21/17.
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
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');


        System.out.println(System.getProperty("user.dir"));
        System.out.println(read(System.getProperty("user.dir")+"/src/cc/io/BufferedReader_.java"));
    }
}
