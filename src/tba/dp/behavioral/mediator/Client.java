package tba.dp.behavioral.mediator;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator=new ConcreteMediator();
        //使同事对象持有中介者对象
        ConcreteColleagueA colleagueA=new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB=new ConcreteColleagueB(mediator);

        //使中介者持有并维护两个同事类
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        colleagueA.send("吃过饭了吗？");
        colleagueB.send("刚吃过");
    }
}
