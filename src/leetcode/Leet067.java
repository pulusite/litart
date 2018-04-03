package leetcode;

/**
 * Created by zhangdong on 9/25/17.
 */
public class Leet067 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        while (i>=0 || j>=0){
            int sum = carry;
            if (i>=0) sum+=a.charAt(i--)-'0';
            if (j>=0) sum+=b.charAt(j--)-'0';
            sb.insert(0,sum%2);
            carry=sum/2;
        }
        if (carry!=0) sb.insert(0,carry);
        return sb.toString();
    }

    public static void main(String[] args) {
        Leet067 leet = new Leet067();
        System.out.println(leet.addBinary("11","1"));
    }
}
