package prototype.cloneContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class ButtonContainer extends JPanel implements CloneContainer{
    JButton []buttons;
    ButtonContainer(){
        buttons = new JButton[25];
        setLayout(new GridLayout(5,5));
        for (int i = 0; i < 25; i ++){
            buttons[i] = new JButton();
            add(buttons[i]);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton b = (JButton) e.getSource();
                    Color newColor = JColorChooser.showDialog(null, "", b.getBackground());
                    if (newColor != null){
                        b.setBackground(newColor);
                    }
                }
            });
        }
    }
    @Override
    public Object cloneContainer() {
        Object object = null;
        try{
            ByteArrayOutputStream outOne = new ByteArrayOutputStream();
            ObjectOutputStream outTwo = new ObjectOutputStream(outOne);
            outTwo.writeObject(this);//将原型对象写入对象输入流
            ByteArrayInputStream inOne = new ByteArrayInputStream(outOne.toByteArray());
            ObjectInputStream inTwo = new ObjectInputStream(inOne);
            object = inTwo.readObject();//创建新的对象，原型的复制品
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
