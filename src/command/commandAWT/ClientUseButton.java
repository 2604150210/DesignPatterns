package command.commandAWT;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class ClientUseButton extends JFrame{

    JButton button;
    Command command;
    Invoke person;
    public ClientUseButton(){
        person = new Invoke();
        command = new MultiCommand(new ShowMultForm());
        person.setCommand(command);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        button = person.getButton();
        frame.add(button);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//    public void setCommand(Command command) {
//        person.setCommand(command);
//    }

    public static void main(String[] args) {
        new ClientUseButton();
    }
}
