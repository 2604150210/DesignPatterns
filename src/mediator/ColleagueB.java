package mediator;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class ColleagueB implements Colleague {
    ConcreteMediator mediator;
    String name;
    ColleagueB(ConcreteMediator mediator){
        this.mediator = mediator;
        mediator.registerColleagueB(this);
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
