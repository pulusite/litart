package tba.dp.behavioral.templatemethod;

/**
 * Created by zhangdong on 2018/4/10.
 */
public class Client {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}