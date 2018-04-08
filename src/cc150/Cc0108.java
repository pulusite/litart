package cc150;

/**
 * Created by zhangdong on 1/1/18.
 */
public class Cc0108 {
    public boolean isRotation(String s1,String s2){
        int len=s1.length();
        if (len==s2.length() && len>0){
            String s1s1=s1+s1;
            return isSubstring(s1s1,s2);
        }
        return false;
    }
    public boolean isSubstring(String str,String subStr){
        return true;
    }
}
