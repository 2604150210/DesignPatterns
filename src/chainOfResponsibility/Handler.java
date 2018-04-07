package chainOfResponsibility;

/**
 * Created by jal on 2018/4/7 0007.
 */
public interface Handler {
    void handlerRequest(String number);
    void setNextHandler(Handler handler);
}
