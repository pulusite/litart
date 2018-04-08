package cc150;

import java.util.HashMap;

/**
 * Created by zhangdong on 1/1/18.
 * 0.char+数字的结果为一个数字
 * 1.注意首
 * 2.注意尾部
 */
public class Cc0105 {
    public String compressBad(String str){
        if (str==null || str.length()==1) return str;
        HashMap<Character,Integer> map= new HashMap();
        StringBuilder newStr=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (map.get(c)==null){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
            if (i>1 && str.charAt(i)!=str.charAt(i-1)){
                newStr=newStr.append(""+str.charAt(i-1)+map.get(str.charAt(i-1)));
                map.clear();
                map.put(c,1);
            }
            if (i==str.length()-1){
                newStr.append(""+str.charAt(i)+map.get(str.charAt(i)));
            }
        }
        return newStr.length()==str.length()?str:newStr.toString();
    }

    public static void main(String[] args) {
        String str="aabcccccaaa";
        Cc0105 cc0105=new Cc0105();
        System.out.println(cc0105.compressBad(str));
    }
}
