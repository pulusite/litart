package tba.mianshi;

import org.junit.Test;

/**
 * Created by zhangdong on 4/22/18.
 */

class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }

}

class B extends A {
    public String show(B obj) {
        return ("B and B");
    }

    public String show(A obj) {
        return ("B and A");
    }
}

class C extends B {

}

class D extends B {

}

public class ABCD {
    @Test
    public void test() {
//        A a1 = new A();
//        A a2 = new B();
//        B b = new B();
//        C c = new C();
//        D d = new D();
//
//        System.out.println("1--" + a1.show(b));// A and A
//        System.out.println("2--" + a1.show(c));// A and A
//        System.out.println("3--" + a1.show(d));// A and D
//
//        System.out.println("4--" + a2.show(b));// B and A
//        System.out.println("5--" + a2.show(c));// B and A
//        System.out.println("6--" + a2.show(d));// A and D
//
//        System.out.println("7--" + b.show(b));// B and B
//        System.out.println("8--" + b.show(c));// B and B
//        System.out.println("9--" + b.show(d));// A and D
    }
}

