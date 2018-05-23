package tba.keywords;

/**
 * Created by dongzhang on 5/14/17.
 */
public class Swap_ {
    public static void swap(int a, int b){
        int temp =a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int x = 1, y = 2;
        Swap_.swap(x,y);
        System.out.println(x+" "+y);
    }

}
