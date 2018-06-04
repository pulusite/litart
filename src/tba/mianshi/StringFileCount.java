package tba.mianshi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class StringFileCount {
    public static void main(String[] args) {
        try{
            System.out.println(strCount("F:\\myJava\\test\\javaText.txt","Java"));
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static int strCount(String fileName,String str )throws IOException{
        int count=0;
        StringBuilder sb=new StringBuilder(5000);//将整个文件作为字符串存放在程序内
        //建立流读取文件
        BufferedReader br=new BufferedReader(new FileReader(fileName));
        String s="";//临时存放读取的一行
        while((s=br.readLine())!=null){
            sb.append(s);
        }
        //split()方法返回以参数为分隔符的数组，那么数组的大小就是分隔符的个数+1
        count=sb.toString().split(str).length-1;
        return count;
    }
}
