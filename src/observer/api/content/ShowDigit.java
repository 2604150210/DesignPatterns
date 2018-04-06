package observer.api.content;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class ShowDigit extends JPanel implements Observer {
    Observable subject;
    JTextArea text;
    Vector<String>vector;
    ShowDigit(Observable subject){
        this.subject = subject;
        subject.addObserver(this);
        text = new JTextArea(10,15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        add(new JScrollPane(text));
        vector = new Vector<String>();
    }
    @Override
    public void update(Observable o, Object arg) {
        text.setText(null);
        text.append("出现的数字有：\n");
        vector.removeAllElements();
        String content = arg.toString();
        String regex = "\\D+";
        String digitWords[] = content.split(regex);
        for(int i = 0; i < digitWords.length; i++){
            if (! vector.contains(digitWords[i]));
                vector.add(digitWords[i]);
        }
        for (String i : vector){
            text.append(i);
        }
    }
}
