package strategyPattern.version0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jal on 2018/1/24 0024.
 */
public class PayCount extends JFrame implements ActionListener{
    double total = 0.0d;
    JLabel priceText = new JLabel("price");
    JLabel numberText = new JLabel("number");
    JTextField price = new JTextField(50);
    JTextField number = new JTextField(50);

    JButton sure = new JButton("sure");
    JButton reset = new JButton("reset");


    PayCount(){
        super("SupermarketPayCount");
        this.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel(new GridLayout(2,3));
        jPanel.add(priceText);
        jPanel.add(price);
        price.addActionListener(this);
        jPanel.add(sure);
        sure.addActionListener(this);
        jPanel.add(numberText);
        jPanel.add(number);
        number.addActionListener(this);
        jPanel.add(reset);
        reset.addActionListener(this);

        setVisible(true);
    }


    private void btnOK_Click(){

    }

    public static void main(String[] args) {
        new PayCount();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
