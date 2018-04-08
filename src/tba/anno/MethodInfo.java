package tba.anno;

import java.lang.annotation.*;

/**
 * Created by zhangdong on 3/14/18.
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Pankaj";
    String date();
    int revision() default 1;
    String comments();
}
