package mediator;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class Application {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);
        ColleagueC colleagueC = new ColleagueC(mediator);
        colleagueA.setName("A国");
        colleagueB.setName("B国");
        colleagueC.setName("C国");
        String [] messA = {
                "要求归还曾抢夺的100斤土豆",
                "要求归还曾抢夺的20头牛"
        };
        String [] messB = {
                "要求归还曾抢夺的10只公鸡",
                "要求归还曾抢夺的15匹马"
        };
        String [] messC = {
                "要求归还曾抢夺的300斤小麦",
                "要求归还曾抢夺的50头驴"
        };
        colleagueA.giveMess(messA);
        colleagueB.giveMess(messB);
        colleagueC.giveMess(messC);
    }
}
