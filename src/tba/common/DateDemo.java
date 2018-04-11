package tba.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dongzhang on 5/11/17.
 */
public class DateDemo {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
        Date date = new Date(currentTime);
        System.out.println(formatter.format(date));


        Date afternoon = new Date();

        Date now = new Date();
        String strTime = now.getHours()+""+now.getMinutes();
        System.out.println(Integer.valueOf(strTime));
    }
}
