package tba.io;

import java.io.File;

/**
 * Created by zhangdong on 4/15/18.
 */
public class DirList {
    public static void main(String args[]) {
        String dirname = "/java";
        File f1 = new File(dirname);
        System.out.println(f1.getAbsolutePath());
        if (f1.isDirectory()) {
            System.out.println( "Directory of " + dirname);
            String s[] = f1.list();
            for (int i=0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}
