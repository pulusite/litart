package tba.dp.behavioral.mediator;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class ConcreteMediator extends Meditator{

    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    protected void send(String messge, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.getMessage(messge);
        } else {
            colleagueA.getMessage(messge);
        }
    }


}
