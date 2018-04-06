package observer.api.content;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.Observable;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class InputTextSubject extends Observable {
    String content;
    JTextArea text;
    InputTextSubject(){
        text = new JTextArea(10,15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        (text.getDocument()).addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                content = text.getText();
                setChanged();
                notifyObservers(content);
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }


        });
    }

    public String getContent() {
        return content;
    }

    public JTextArea getTextArea() {
        return text;
    }
}
