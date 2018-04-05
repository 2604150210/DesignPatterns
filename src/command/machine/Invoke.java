package command.machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class Invoke {
    JButton button;
    Command command;
    Invoke(){
        button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand();
            }
        });
    }
    public void setCommand(Command command){
        this.command = command;
        button.setText(command.getName());
    }
    public JButton getButton(){
        return button;
    }
    private void executeCommand() {
        command.execute();
    }
}
