package tba.yichang;

import java.io.File;
import java.io.InputStream;

/**
 * Created by zhangdong on 2018/4/8.
 */
public class MyException {
    public static void main(String[] args) {
        openFile("");
    }
    public static void openFile(String path){
        File file=new File(".");
        file.list();
//        InputStream inputStream=file.
        try {
            
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("ok");
        }

    }
}
