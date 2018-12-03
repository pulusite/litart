package tba.dp.structural.facade;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Facade {
    ModuleA moduleA=new ModuleA();
    ModuleB moduleB=new ModuleB();
    ModuleC moduleC=new ModuleC();

    public void a1(){
        moduleA.a1();
    }

    public void b2(){
        moduleB.b2();
    }

    public void c2(){
        moduleC.c2();
    }

    public void wrapOperation(){
        moduleA.a1();
        moduleB.b2();
        moduleC.c1();
    }
}
