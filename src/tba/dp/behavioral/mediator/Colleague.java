package tba.dp.behavioral.mediator;

/**
 * Created by zhangdong on 2018/11/29.
 */
public abstract class Colleague {
    protected Meditator meditator;

    public Colleague(Meditator meditator) {
        this.meditator = meditator;
    }

}
