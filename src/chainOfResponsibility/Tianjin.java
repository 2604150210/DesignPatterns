package chainOfResponsibility;

import java.util.ArrayList;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Tianjin implements Handler {
    private Handler handler;
    private ArrayList<String>numberList;
    Tianjin(){
        numberList = new ArrayList<String>();
        numberList.add("30001");
        numberList.add("30002");
        numberList.add("30003");
        numberList.add("30004");
    }
    @Override
    public void handlerRequest(String number) {
        if (numberList.contains(number)){
            System.out.println("他是天津人.");
        }else {
            System.out.println("他不是天津人。");
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
