package chainOfResponsibility.factorial;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class UseInt implements Handler {
    private Handler handler;
    private int result = 1;
    @Override
    public void computerMultiply(String number) {
        try {
            int n = Integer.parseInt(number);
            int i = 1;
            while (i <= n){
                result = result * i;
                if (result < 0){
                    System.out.println("超出我的能力范围，我计算不了");
                    handler.computerMultiply(number);
                    return;
                }
                i++;
            }
            System.out.println(number + "的阶乘是：" + result);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
