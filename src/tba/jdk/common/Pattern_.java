package tba.jdk.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangdong on 2018/4/18.
 */
public class Pattern_ {
    //手机号
    public static boolean isPhone(String ipAddress) {
        String ip = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
        Pattern pattern = Pattern.compile(ip);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
}
