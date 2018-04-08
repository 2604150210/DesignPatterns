package mediator;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class ColleagueA implements Colleague {
    ConcreteMediator mediator;
    String name;
    ColleagueA(ConcreteMediator mediator){
        this.mediator = mediator;
        mediator.registerColleagueA(this);
    }
    @Override
    public void giveMess(String[] mess) {
        mediator.deliverMess(this, mess);
    }

    @Override
    public void receiverMess(String mess) {
        System.out.println(name + "收到的信息是：\n \t " + mess);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
