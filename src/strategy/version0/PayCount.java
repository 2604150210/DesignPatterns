package strategyPattern.version0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jal on 2018/1/24 0024.
 */
public class PayCount extends JFrame implements ActionListener{
    double price1,number1,total = 0;
    JLabel priceText = new JLabel("price");
    JLabel numberText = new JLabel("number");
    JTextField price = new JTextField(50);
    JTextField number = new JTextField(50);

    JButton sure = new JButton("sure");
    JButton reset = new JButton("reset");
    JTextArea jTextArea = new JTextArea(10,40);
    JLabel show = new JLabel("0.00");

    PayCount(){
        super("SupermarketPayCount");
        this.setLayout(new BorderLayout());
        this.setSize(200,300);
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
        this.add(jPanel,BorderLayout.NORTH);
        this.add(jTextArea,BorderLayout.CENTER);
        this.add(show,BorderLayout.SOUTH);
        //this.pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new PayCount();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sure){
            price1 =Double.parseDouble( price.getText());
            number1 = Double.parseDouble(number.getText());
            total += price1 * number1;
            show.setText(String.format("%.2f",total));
            jTextArea.append(String.format("%.2f * %.2f = %.2f\n",price1,number1,total));
        }else if (e.getSource() == reset){
            price.setText("");
            number.setText("");
            total = 0;
            jTextArea.setText("");
            show.setText("0.00");
        }
    }
}
