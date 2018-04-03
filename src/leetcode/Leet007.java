package leetcode;

/**
 * Created by zhangdong on 2017/7/14.
 */
public class Leet007 {
    public int reverse(int x) {
        Integer y = x>=0 ? x : -x;
        String z=y.toString();
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <= z.length(); i++) {
            sb.append(z.charAt(z.length()-i));
        }
        try{
            return x>=0?Integer.valueOf(sb.toString()):-Integer.valueOf(sb.toString());
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        Leet007 leet = new Leet007();
        System.out.println(leet.reverse(964632435));
    }
}
