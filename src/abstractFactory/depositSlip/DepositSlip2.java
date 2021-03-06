package abstractFactory.depositSlip;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class DepositSlip2 implements DepositSlip {
    String clientName;
    String clientNumber;
    int money;
    DepositSlip2(String clientNumber, String clientName, int money){
        this.clientNumber = clientNumber;
        this.clientName = clientName;
        this.money = money;
    }
    @Override
    public String getBankName() {
        return "中国建设银行";
    }

    @Override
    public String getClientName() {
        return clientName;
    }

    @Override
    public String getClientNumber() {
        return clientNumber;
    }

    @Override
    public int getAmountOfMoney() {
        return money;
    }
}
