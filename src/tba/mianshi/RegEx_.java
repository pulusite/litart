package tba.mianshi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class RegEx_ {
    //IP
    /** * 判断是否为合法IP * @return the ip */
    //iPv4的ip地址都是（1~255）.（0~255）.（0~255）.（0~255）的格式
    public static boolean isIp(String ipAddress) {
        String ip = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
        Pattern pattern = Pattern.compile(ip);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
    //邮箱
    public static boolean isEmail(String ipAddress) {
        String ip = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(ip);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
    //手机号
    public static boolean isPhone(String ipAddress) {
        String ip = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
        Pattern pattern = Pattern.compile(ip);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
}
