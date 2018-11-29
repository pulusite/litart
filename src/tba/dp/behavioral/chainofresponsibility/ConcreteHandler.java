package tba.dp.behavioral.chainofresponsibility;

/**
 * Created by zhangdong on 2018/11/26.
 */
public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        if (getSuccessor()!=null){
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        }else {
            System.out.println("处理请求");
        }
    }
}
