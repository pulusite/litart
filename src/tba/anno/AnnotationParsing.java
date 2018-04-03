package tba.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by zhangdong on 3/14/18.
 */
public class AnnotationParsing {
    public static void main(String[] args) {
        try {
            for (Method method : AnnotationParsing.class.getClassLoader().loadClass("tba.anno.AnnotationExample").getMethods()){
                if (method.isAnnotationPresent(tba.anno.MethodInfo.class)){
                    try {
                        for (Annotation anno : method.getDeclaredAnnotations()){
                            System.out.println();
                        }
                    }catch (Exception e){

                    }
                }
            }
        } catch (SecurityException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
