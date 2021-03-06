package tba.jdk.anno;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 3/14/18.
 */
public class AnnotationExample {
    public static void main(String[] args) {

    }
    @Override
    @MethodInfo(author = "Pankaj",comments = "Main method",date = "Nov 17  2012",revision = 1)
    public String toString(){
        return "Overriden toString method";
    }

    @Deprecated
    @MethodInfo(comments = "deprecated method",date = "Nov 17 2017")
    public static void oldMethod(){
        System.out.println("old method,don't use it.");
    }

    @SuppressWarnings({"unchecked","deprecation"})
    @MethodInfo(author = "Pankaj",comments = "Main method", date = "Nov 17 2012",revision = 10)
    public static void genericsTest() throws Exception{
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }
}
