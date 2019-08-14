package tba.jdk.ext;

/**
 * Created by zhangdong on 2018/4/18.
 *
 * 指定父类
 */

import javassist.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JavassistExtendDemo {

    public static void main(String[] args) throws CannotCompileException, IOException, NotFoundException {

        ClassPool pool = ClassPool.getDefault();

        //定义类
        CtClass stuClass = pool.makeClass("com.ricky.Student");

        //设置父类
        stuClass.setSuperclass(pool.get("com.ricky.codelab.javassist.domain.Person"));

        //hobbies属性
        CtField ageField = new CtField(pool.getCtClass("java.util.List"), "hobbies", stuClass);
        stuClass.addField(ageField);

        Class<?> clazz = stuClass.toClass();
        System.out.println("class:"+clazz.getName());

        System.out.println("------------属性列表------------");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType()+"\t"+field.getName());
        }

        System.out.println("------------方法列表------------");
        //方法
        Method[] methods = clazz.getMethods();
        for (Method method: methods){
            System.out.println(method.getReturnType()+"\t"+method.getName()+"\t"+Arrays.toString(method.getParameterTypes()));
        }

    }

}