package tba.jdk.keywords;


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

    public static void main(String[] args) {
        final Person p1=new Person("1");
        Person p2=new Person("2");
        p1.left=p2;
        p2.right=p2;
    }
}
class Person{
    String id;

    Person left;
    Person right;

    Person(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                '}';
    }
}
