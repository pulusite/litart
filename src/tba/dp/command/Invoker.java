package tba.dp.command;

/**
 * Created by zhangdong on 2018/11/26.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
