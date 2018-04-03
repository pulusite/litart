package leetcode;

/**
 * Created by zhangdong on 2017/9/29.
 */
public class Leet197_ {
    public String risingTemperature(){
        return "SELECT w1.Id \n" +
                "FROM Weather w1 INNER JOIN Weather w2 \n" +
                "ON TO_DAYS(w1.Date) = TO_DAYS(w2.Date) + 1 \n" +
                "AND w1.Temperature > w2.Temperature";
    }
}
