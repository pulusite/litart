package tba.mianshi;

import java.util.*;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class RandomStringSort {
    public static String getStr(int n) { // 定义需要生成字符串的位数
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random ran = new Random();
        char[] ca = new char[n]; // 定义一个字符数组，用于String创建的构造子
        for (int i = 0; i < ca.length; i++) {
            ca[i] = s.charAt(ran.nextInt(62));
        }
        return new String(ca);
    }
    public static String[] getStrings(int n) {
        String[] sa = new String[n];
        for (int i = 0; i < n; i++) {
            sa[i] = getStr(8); // 传入需要生成字符串的位数
        }
        return sa;
    }
    public static void main(String[] args) {
        String[] sa = getStrings(20); // 传入的参数是需要的字符串想要多少个。
        for (int i = 0; i < sa.length; i++) {
            System.out.println(sa[i]);
        }
        // 排序：先转换成List，用Collections的排序方法
        List list = new ArrayList();
        list = Arrays.asList(sa); // 数组转换成List
        Collections.sort(list); // 排序List中的元素顺序
        System.out.println(list); // 打印排好序的结果
    }
}
