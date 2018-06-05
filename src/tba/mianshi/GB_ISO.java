package tba.mianshi;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by zhangdong on 2018/6/5.
 */
public class GB_ISO {
    @Test
    public void transfer(){
        try{
            String ss = "java学习";
            System.out.println(ss);
            String result = new String(ss.getBytes("GB2312"),"iso-8859-1");
            System.out.println(result);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
