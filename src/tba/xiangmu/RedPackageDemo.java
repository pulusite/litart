package tba.xiangmu;

import java.util.Random;

/**
 * Created by zhangdong on 2017/10/20.
 */
public class RedPackageDemo {
    public static void main(String[] args) {
        RedPackageDemo demo = new RedPackageDemo();
        RedPackage redPackage = new RedPackage();

        int size = 10;
        redPackage.setRemainSize(size);
        redPackage.setRemainMoney(100);
        for (int i = 0; i < size; i++) {
            System.out.println(demo.getRandomMoney(redPackage));
        }
    }

    public double getRandomMoney(RedPackage _redPackage) {
        // remainSize 剩余的红包数量
        // remainMoney 剩余的钱
        if (_redPackage.remainSize == 1) {
            _redPackage.remainSize--;
            return (double) Math.round(_redPackage.remainMoney * 100) / 100;
        }
        Random r     = new Random();
        double min   = 0.01; //
        double max   = _redPackage.remainMoney / _redPackage.remainSize * 2;
        double money = r.nextDouble() * max;
        money = money <= min ? 0.01: money;
        money = Math.floor(money * 100) / 100;
        _redPackage.remainSize--;
        _redPackage.remainMoney -= money;
        return money;
    }
//    static void init() {
//        redPackage.remainSize  = 30;
//        redPackage.remainMoney = 500;
//    }
}
