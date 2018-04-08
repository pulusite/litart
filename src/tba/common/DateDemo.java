package tba.common;

import java.util.Date;

/**
 * Created by dongzhang on 5/11/17.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date afternoon = new Date();

        Date now = new Date();
        String strTime = now.getHours()+""+now.getMinutes();
        System.out.println(Integer.valueOf(strTime));
    }
}
