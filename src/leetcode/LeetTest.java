package leetcode;

import com.sun.xml.internal.ws.util.StringUtils;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zhangdong on 2017/7/11.
 */
public class LeetTest {
    public static int getDiscrepantDays(Date dateStart, Date dateEnd) {
        return (int) ((dateEnd.getTime() - dateStart.getTime()) / 1000 / 60 / 60 / 24);
    }
    public int maxArea(int[] height) {
        return 0;
    }
    public static void main(String[] args) throws Exception{
        String sss="https://h5pay.jd.com/code?c=64zrlm6x6739m0";
        System.out.println(sss.substring(sss.lastIndexOf("=")+1));
        Map<String, Object> reqMap=new HashMap<String,Object>();
        reqMap.put("1","aa");
        System.out.println(reqMap);
        System.out.println("".equals(null));
        System.out.println("1515061286254".length());
        //两个日期之间的天数
        Date today = new Date();
        String dateExpiredStr = "2018-2-17 1:21:28";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("外语商务英语课程过期还剩："+getDiscrepantDays(today,format.parse(dateExpiredStr))+"天");
        HashMap<Character,Integer> hm = new HashMap<>();
        System.out.println(hm.get('('));
        Map<String,String> map1 = new HashMap<String, String>();
//        map1.put("s",1);//会报错
        Map map2 = new HashMap<String, String>();
        map2.put("s",1);//不会报错
//        System.out.println(map1.get("s").getClass());

        System.out.println(new Date());
        System.out.println(new Date(new Date().getTime()+600000));

        InetAddress addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress();
        System.out.println(ip);

        System.out.println(System.currentTimeMillis() + "");
        System.out.println();
        Long val = 0L;
        System.out.println(val.longValue());
        String ss = "1";
        Byte byt = 1;
        System.out.println(ss.equals(byt.toString()));

        Integer integer = new Integer(1);
        Integer integer1= new Integer(1);
        System.out.println(integer==integer1);

        Map hashMap = new HashMap<String, String>();
        hashMap.put("ads",1);
        System.out.println(hashMap.get("ads").getClass());

        Integer i =2;
        int j=2;
        System.out.println(i==j);

        String str="abcd";
        String s="ab";
        System.out.println(str.indexOf(s));

        System.out.println(Long.parseLong("0") == 0L);

        System.out.println("abcdef".substring(2,4));

        System.out.println(""==null);

        System.out.println("--------------------------------");

        int[] nums = new int[10];
        System.out.println(nums[9]);

        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
    }
}
