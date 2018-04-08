package tba.basic;

/**
 * Created by zhangdong on 4/1/18.
 */
public  class AbstractClassAnalyze {
    public static boolean getState() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) throws Exception{
        System.out.println(getState());
    }
}
