package tba.jvm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by zhangdong on 2018/6/11.
 */
public class Reflect_ {
    public static void main(String[] args) throws Exception{
        Class people =Class.forName("tba.jvm.People");
        System.out.println(people);
        Field name=people.getDeclaredField("name");
        name.setAccessible(true);//通过Class的几个方法访问了原本不可以被访问的name属性：
        People people1=(People)people.newInstance();
        name.set(people1,"Aristark");
        System.out.println(people1.getName());

        Annotation[] annotations = people.getAnnotations();
        Constructor[] constructors = people.getConstructors();
        Class superclass = people.getSuperclass();
        Class[] interfaces = people.getInterfaces();
        Package packag = people.getPackage();
        String className = people.getName();
        String simpleClassName = people.getSimpleName();//仅仅只是想获取类的名字(不包含包名)


        Class clazz=People.class;
        Field[] fields=clazz.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field);
        }
        Method[] methods=clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        People p=(People) clazz.newInstance();
        p.setName("张东");
        System.out.println(p.getName());
    }
}
