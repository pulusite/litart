package tba.dp.mubanfangfa;

/**
 * Created by zhangdong on 2018/4/10.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}