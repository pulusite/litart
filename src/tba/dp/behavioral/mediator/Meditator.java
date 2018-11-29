package tba.dp.behavioral.mediator;

/**
 * Created by zhangdong on 2018/11/29.
 */
public abstract class Meditator {
    protected abstract void send(String message,Colleague colleague);
}
