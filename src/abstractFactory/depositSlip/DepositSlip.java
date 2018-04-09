package abstractFactory.depositSlip;

/**
 * Created by jal on 2018/4/9 0009.
 */
public interface DepositSlip {
    String getBankName();
    String getClientName();
    String getClientNumber();
    int getAmountOfMoney();
}
