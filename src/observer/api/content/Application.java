package observer.api.content;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class Application extends JFrame {
    Application(){
        InputTextSubject textSubject = new InputTextSubject();
        ShowWord observerOne = new ShowWord(textSubject);
        ShowDigit observerTwo = new ShowDigit(textSubject);
        setLayout(new FlowLayout());
        add(new JScrollPane(textSubject.getTextArea()));
        add(observerOne);
        add(observerTwo);
        setBounds(20,20,400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Application();
    }
}
