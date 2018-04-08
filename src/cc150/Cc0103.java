package cc150;

/**
 * Created by zhangdong on 2017/12/14.
 *
 * 两个字符串，一个重新排列后能不能变成另外一个
 */
public class Cc0103 {
    public String sort(String s){
        char[] content=s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public boolean permutation(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public boolean permutation2(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
