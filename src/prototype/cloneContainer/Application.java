package prototype.cloneContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class Application extends JFrame {
    JTabbedPane jtp;
    ButtonContainer con;
    JButton add, del;
    public Application(){
        add = new JButton("复制窗口中当前容器");
        del = new JButton("删除窗口中当前容器");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = jtp.getSelectedIndex();
                ButtonContainer container = (ButtonContainer) jtp.getComponentAt(index);
                ButtonContainer conCopy = (ButtonContainer) container.cloneContainer();
                jtp.add("复制的容器",conCopy);
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = jtp.getSelectedIndex();
                ButtonContainer container = (ButtonContainer) jtp.getComponentAt(index);
                jtp.remove(index);
            }
        });
        JPanel pSouth = new JPanel();
        pSouth.add(add);
        pSouth.add(del);
        add(pSouth, BorderLayout.SOUTH);
        con = new ButtonContainer();
        jtp = new JTabbedPane(JTabbedPane.LEFT);
        add(jtp,BorderLayout.CENTER);
        jtp.add("原型容器",con);
        setBounds(100, 100, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Application();
    }
}
