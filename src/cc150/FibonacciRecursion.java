package cc150;

/**
 * Created by zhangdong on 9/12/17.
 */
public class FibonacciRecursion {
    int fibonacci(int i){
        if (i==0) return 0;
        if (i==1) return 1;
        return fibonacci(i-1) + fibonacci(i-2);
    }

    public static void main(String[] args) {
        FibonacciRecursion fr= new FibonacciRecursion();
        System.out.println(fr.fibonacci(5));
    }
}
