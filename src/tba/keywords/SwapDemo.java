package tba.keywords;

/**
 * Created by dongzhang on 5/14/17.
 */
public class SwapDemo {
    public static void swap(int a, int b){
        int temp =a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int x = 1, y = 2;
        SwapDemo.swap(x,y);
        System.out.println(x+" "+y);
    }

}
