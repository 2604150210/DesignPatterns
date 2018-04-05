package command.machine;

import javax.swing.*;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class Light extends JPanel{
    String name;
    Icon imageIcon;
    JLabel label;
    public Light(){
        label = new JLabel("我是电灯泡！");
        add(label);
    }
    public void on(){
        label.setIcon(new ImageIcon("OnLight.jpg"));
    }
    public void off(){
        label.setIcon(new ImageIcon("OffLight.jpg"));
    }
}
