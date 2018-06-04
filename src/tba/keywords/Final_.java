package tba.keywords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by dongzhang on 4/8/17.
 */
public class Final_ {
    private final List foo;

    public Final_()
    {
        foo = new ArrayList();
        foo.add("foo"); // Modification-1
    }
    public static void main(String[] args)
    {
        Final_ t = new Final_();
        t.foo.add("bar"); // Modification-2
        System.out.println("print - " + t.foo);
    }
}
