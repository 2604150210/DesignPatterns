package mediator;

/**
 * Created by jal on 2018/4/8 0008.
 */
public interface Colleague {
    void giveMess(String[] mess);
    void receiverMess(String mess);
    void setName(String name);
    String getName();
}
