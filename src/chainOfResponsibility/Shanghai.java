package chainOfResponsibility;

import java.util.ArrayList;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Shanghai implements Handler {
    private Handler handler;
    private ArrayList<String>numberList;
    Shanghai(){
        numberList = new ArrayList<String>();
        numberList.add("20001");
        numberList.add("20002");
        numberList.add("20003");
        numberList.add("20004");
    }
    @Override
    public void handlerRequest(String number) {
        if (numberList.contains(number)){
            System.out.println("他是上海人.");
        }else {
            System.out.println("他不是上海人。");
            if (handler != null){
                handler.handlerRequest(number);
            }else {
                System.out.println("他不是这些城市的人。");
            }
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
