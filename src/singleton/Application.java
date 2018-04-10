package singleton;

import javax.swing.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class Application{
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("jal");
        JFrame frame2 = new JFrame("cathy");
        Moon jal = Moon.getMoon();
        jal.show();
        System.out.println("jal.show()  "+jal.show());
        String  jalStr = jal.show();
        Moon cathy = Moon.getMoon();
        String  cathyStr = "@@@";
        JLabel label1 = new JLabel(jalStr);
        JLabel label2 = new JLabel(cathyStr);
        frame1.add(label1);
        frame2.add(label2);
        frame1.setBounds(10, 10, 360, 150);
        frame2.setBounds(370, 10, 360, 150);
        frame1.setVisible(true);
        frame2.setVisible(true);
    }
}
