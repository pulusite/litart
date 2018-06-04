package tba.keywords;

import org.junit.Test;

/**
 * Created by zhangdong on 5/26/18.
 */
public class Polymorphic_ {
     class Wine {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Wine(){
        }

        public String drink(){
            return "喝的是 " + getName();
        }

        /**
         * 重写toString()
         */
        public String toString(){
            return null;
        }
    }

     class JNC extends Wine{
        public JNC(){
            setName("JNC");
        }

        /**
         * 重写父类方法，实现多态
         */
        public String drink(){
            return "喝的是 " + getName();
        }

        /**
         * 重写toString()
         */
        public String toString(){
            return "Wine : " + getName();
        }
    }

     class JGJ extends Wine{
        public JGJ(){
            setName("JGJ");
        }

        /**
         * 重写父类方法，实现多态
         */
        public String drink(){
            return "喝的是 " + getName();
        }

        /**
         * 重写toString()
         */
        public String toString(){
            return "Wine : " + getName();
        }
    }

    @Test
    public void test(){
        //定义父类数组
        Wine[] wines = new Wine[2];
        //定义两个子类
        JNC jnc = new JNC();
        JGJ jgj = new JGJ();

        //父类引用子类对象
        wines[0] = jnc;
        wines[1] = jgj;

        for(int i = 0 ; i < 2 ; i++){
            System.out.println(wines[i].toString() + "--" + wines[i].drink());
        }
        System.out.println("-------------------------------");

        Object o = new Wine();
        System.out.println(o.toString());
    }
//    OUTPUT:
//    Wine : JNC--喝的是 JNC
//    Wine : JGJ--喝的是 JGJ
//-------------------------------
}
