package tba.io;

import java.io.File;

/**
 * Created by zhangdong on 2018/4/18.
 */
public class File_ {
    public static void main(String[] args) {
        File file=new File(".");
        System.out.println(file.getAbsolutePath());
        String[] list=file.list();
        for(String dirItem : list)
            System.out.println(dirItem);
    }
}
