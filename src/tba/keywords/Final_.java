package tba.keywords;

/**
 * Created by dongzhang on 4/8/17.
 */
public class Final_ {
    int i;
    final int j;

    static Final_ obj;

    public Final_() {
        i=1;
        j=2;
    }

    public static void writer(){
        obj=new Final_();
    }

    public static void reader(){
        Final_ final_=obj;
        int a=obj.i;
        int b=obj.j;
    }
}
