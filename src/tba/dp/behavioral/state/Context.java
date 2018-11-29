package tba.dp.behavioral.state;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String sampleParameter){
        state.handle(sampleParameter);
    }
}
