package chainOfResponsibility.factorial;

import java.math.BigInteger;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class UseBigInteger implements Handler {
    private BigInteger result = BigInteger.ONE;
    private Handler handler;
    @Override
    public void computerMultiply(String number) {
        try {
            BigInteger n = new BigInteger(number);
            BigInteger i = BigInteger.ONE;
            while (i.compareTo(n)<0){
                result = result.multiply(i);
                i = i.add(BigInteger.ONE);
            }
            System.out.println(number+"的阶乘是：" + result);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
