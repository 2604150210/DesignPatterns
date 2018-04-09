package abstractFactory.depositSlip;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class ChinaBank extends Bank {
    @Override
    public DepositSlip createDepositSlip(String number, String name, int money) {
        return new DepositSlip1(number, name, money);
    }

    @Override
    public Seal createSeal() {
        return new SealOne();
    }
}
