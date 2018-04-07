package chainOfResponsibility;

import java.util.ArrayList;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Beijing implements Handler {
    private Handler handler;
    private ArrayList<String>numberList;
    Beijing(){
        numberList = new ArrayList<String>();
        numberList.add("10001");
        numberList.add("10002");
        numberList.add("10003");
        numberList.add("10004");
    }
    @Override
    public void handlerRequest(String number) {
        if (numberList.contains(number)){
            System.out.println("他是北京人.");
        }else {
            System.out.println("他不是北京人。");
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
