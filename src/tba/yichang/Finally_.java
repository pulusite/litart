package tba.yichang;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by zhangdong on 7/8/18.
 */
public class Finally_ {
    public static void main(String[] args) {
        try{
            File file=new File("");
            FileInputStream fileInputStream=new FileInputStream(file);
            fileInputStream.read();
            return ;
        }catch (Exception e){

        }finally {
            System.out.println("000");
        }
    }
}
