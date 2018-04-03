package lintcode;

/**
 * Created by zhangdong on 2017/9/11.
 */
public class Lint013 {
    public int strStr(String source, String target) {
        if (source == null || target == null){
            return -1;
        }
        int j;
        for (int i = 0; i < source.length()-target.length()+1; i++) {
            for (j = 0; j < target.length(); j++) {
                if (source.charAt(i+j) != target.charAt(j)){
                    break;
                }
            }
            if (j==target.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Lint013 lint = new Lint013();
        String source = "abcdabcdefg";
        String target = "bcd";
        System.out.println(lint.strStr(source, target));
    }
}
