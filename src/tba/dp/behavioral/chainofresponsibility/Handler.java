package tba.dp.behavioral.chainofresponsibility;

/**
 *
 * successor 继任者
 *
 * Created by zhangdong on 2018/11/26.
 */
public abstract class Handler {
    protected Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
