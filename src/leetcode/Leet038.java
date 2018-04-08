package leetcode;

/**
 * Created by zhangdong on 2017/7/20.
 */
public class Leet038 {
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }
        String str=countAndSay(n-1)+"*";
        char[] chs=str.toCharArray();
        int count=1;
        String result="";
        for (int i = 0; i < chs.length-1; i++) {
            if (chs[i]==chs[i+1]){
                count+=1;
            }else {
                result=result+count+chs[i];
                count=1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Leet038 leet = new Leet038();
        System.out.println(leet.countAndSay(4));
    }
}
