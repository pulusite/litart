package tba.md5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangdong on 2018/5/15.
 */
public class JsonMD5 {
    public static void main(String[] args) {

        Map<String ,Object> map=new HashMap<String,Object>();
        map.put("name", "小明");
        map.put("age", 12);
        map.put("sex", "男");
        map.put("school", "xxx中学");
        map.put("address", "xxx小区");
        /***MD5签名与验签**/
        String key="123456ADSEF";
    }
}
