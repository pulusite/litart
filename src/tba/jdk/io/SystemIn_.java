package tba.jdk.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * Created by zhangdong on 6/7/18.
 */
public class SystemIn_ {
    public static void main(String[] args) throws Exception{
        SystemIn_ systemIn_=new SystemIn_();
        systemIn_.console();
    }
    public void console() throws Exception{
        char c;
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String curDir=System.getProperty("user.dir")+File.separator+"resource";
        File file=new File(curDir+"/systemin.txt");
        file.createNewFile();

        System.out.println("输入字符，按'q'键退出");
//        do{
//            c=(char)br.read();
//            s=br.readLine();
//            System.out.println(s);
//        }while (c!='q');
    }
}
