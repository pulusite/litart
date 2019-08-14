import tba.jdk.jihe.Person;

import java.io.File;

/**
 * Created by zhangdong on 2017/11/15.
 */
public class Test {
    public static void main(String[] args) {

        String str="00_00_))_";
        System.out.println(str.indexOf("_"));

        System.out.println("BJCustomService".substring(0,2));

        if (!"".equals(null)){
            System.out.println("null");
        }

        System.out.println("1f713261aa7f4e4f42dbd3f906f2ebb2".length());


        System.out.println(5/3);
//        List list=new ArrayList();
//        list.add("0");
//        list.subList(0,3).clear();
//        System.out.println(list.size());


        File file=new File("D:/NFS/order/1.txt");
        System.out.println(file.exists());


        String url="11_2626226727272";
        String s=url.substring(0,url.lastIndexOf("_"));
        System.out.println(url);
        System.out.println("ubuntu is awesome");

        Person person=null;
        System.out.println(person);
    }


}
