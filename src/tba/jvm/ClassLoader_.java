package tba.jvm;

/**
 * Created by dongzhang on 6/4/17.
 */
public class ClassLoader_ {
    public static void main(String[] args) throws ClassNotFoundException{
        System.out.println("Hello World!");
        ClassLoader classLoader = ClassLoader_.class.getClassLoader();
        System.out.println(classLoader);


        sun.misc.Launcher launcher = sun.misc.Launcher.getLauncher(); //获取Java启动器
        ClassLoader classLoader0 = launcher.getClassLoader();          //获取类加载器ClassLoader用来加载class到内存来

        ClassLoader classloader1 = launcher.getClassLoader();//取得AppClassLoader类
        classloader1.loadClass("org.luanlouis.jvm.load.Main");//加载自定义类
    }
}
