package abstractFactory.depositSlip;

import java.awt.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class Application {
    public static void main(String[] args) {
        ShowDepositSlip showDepositSlip = new ShowDepositSlip();
        Bank bank = new ChinaBank();
        showDepositSlip.showDepositSlip(bank, "2604150210", "jal", 3000);
        showDepositSlip.setLocation(20, 20);
//        此处没写完，应该调用paintComponent（）
        showDepositSlip = new ShowDepositSlip();
        bank = new ChinaConstructionBank();
        showDepositSlip.showDepositSlip(bank, "2604150203", "fxl", 1000);
        showDepositSlip.setLocation(240, 20);
        showDepositSlip = new ShowDepositSlip();
        bank = new BankOfCommunications();
        showDepositSlip.showDepositSlip(bank, "2604150231","ylt", 5000);
        showDepositSlip.setLocation(460, 20);
    }
}
