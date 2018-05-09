package tba.io;

import java.io.File;

/**
 * Created by zhangdong on 2018/4/8.
 *
 * File 文件和目录路径名的抽象表示形式。
 */
public class DirPath_ {
    public static void main(String[] args) throws Exception{
        File file=new File("file.txt");
        System.out.println(file.getPath());


//        System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径
//        String path = InputStreamAnalyze.class.getClassLoader().getResource("").getPath();
//        System.out.println(path);
//        File directory = new File("");//设定为当前文件夹
//        System.out.println(directory.getCanonicalPath());//获取标准的路径
//        System.out.println(directory.getAbsolutePath());//获取绝对路径
    }
}
