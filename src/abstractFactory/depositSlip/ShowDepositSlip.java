package abstractFactory.depositSlip;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class ShowDepositSlip extends JPanel {
    DepositSlip depositSlip;
    Seal seal;
    boolean boo;
    JLabel label;
    Image image;
    JFrame frame;
    ShowDepositSlip(){
        setLayout(null);
        setSize(200, 200);
        label = new JLabel();
        add(label);
        frame = new JFrame();
        frame.add(this);
    }
    public void showDepositSlip(Bank bank, String number, String name, int money){
        depositSlip = bank.createDepositSlip(number, name, money);
        seal = bank.createSeal();
        image = seal.getImage();
        label.setIcon(new ImageIcon(image));
        boo = true;
        frame.setSize(200,280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setLocation(int a, int b){
        frame.setLocation(a, b);
    }
    public void paintComponent(Graphics g){
        if (boo){
            g.drawString(depositSlip.getBankName() + "存款凭证", 10, 20);
            g.drawString("账号：" + depositSlip.getClientNumber() , 20, 50 );
            g.drawString("姓名：" + depositSlip.getClientName() , 20, 80);
            g.drawString("金额：" + depositSlip.getAmountOfMoney(), 20, 110);
            label.setBounds(60, 120, image.getWidth(this), image.getHeight(this));
        }
    }
}
