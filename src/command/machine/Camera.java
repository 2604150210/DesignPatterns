package command.machine;

import javax.swing.*;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class Camera extends JPanel{
    String name;
    Icon imageIcon;
    JLabel label;
    public Camera(){
        label = new JLabel("我是摄像头！");
        add(label);
    }
    public void on(){
        label.setIcon(new ImageIcon("OnCamera.jpg"));
    }
    public void off(){
        label.setIcon(new ImageIcon("OffCamera.jpg"));
    }
}
