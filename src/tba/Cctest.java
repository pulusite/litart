package tba;

import java.text.SimpleDateFormat;

/**
 * Created by dongzhang on 4/1/17.
 */
public class Cctest {
    private int iii;

    public int getIii() {
        return iii;
    }

    public void setIii(int iii) {
        this.iii = iii;
    }

    public static void main(String[] args) {
        Cctest cctest=new Cctest();
        System.out.println(cctest.getIii());
        System.out.println();
        SimpleDateFormat sdf = new SimpleDateFormat();
    }
}
