package cc150;

/**
 * Created by dongzhang on 7/5/17.
 */
public class Cc0101 {
    public boolean isUniqueChars2(String str){
        if (str.length() > 256) return false;
        
        boolean[] char_set= new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            if (char_set[str.charAt(i)]){
                return false;
            }
            char_set[str.charAt(i)]=true;
        }
        return true;
    }

    public boolean isUniqueChars(String str){
        if (str.length() > 26) return false;

        int checker=0;
        for (int i = 0; i < str.length(); i++) {
            int val=str.charAt(i)-'a';
            if ((checker & (1<<val))>0){
                return false;
            }
            checker |=(1<<val);
        }
        return true;
    }
}
