package tba.mianshi;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class Fibonacci_ {
    @Test
    public void test(){
        System.out.println(fibonacci(30));
    }
    public int fibonacci(int n){
        if (n==1 || n==2) return 1;
        int[] res=new int[n];
        res[0]=1;
        res[1]=1;
        for (int i = 2; i < n; i++) {
            res[i]=res[i-1]+res[i-2];
        }
        return res[n-1];
    }
//    public int fibonacci(int n){
//        if (n==1 || n==2) return 1;
//        return fibonacci(n-1)+fibonacci(n-2);
//    }
}
