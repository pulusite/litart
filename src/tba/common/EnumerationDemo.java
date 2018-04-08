package tba.common;

import java.util.Enumeration;

/**
 * Created by dongzhang on 5/15/17.
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        Enumeration enumeration = new MyEnumeration();

    }
}

class MyEnumeration implements Enumeration{
    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public Object nextElement() {
        return null;
    }
}
