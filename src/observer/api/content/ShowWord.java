package observer.api.content;

import javax.swing.*;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.TreeSet;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class ShowWord extends JPanel implements Observer {
    Observable subject;
    JTextArea text;
    TreeSet<String>wordlist;
    ShowWord(Observable subject){
        this.subject = subject;
        subject.addObserver(this);
        text = new JTextArea(10,15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        add(new JScrollPane(text));
    }
    @Override
    public void update(Observable o, Object arg) {
        text.setText(null);
        text.append("出现的单词有（按字典序排序）：\n");
        wordlist.clear();
        String content = arg.toString();
        String regex = "[\\s\\d\\p{Punct}]+";
        String words[] = content.split(regex);
        for(int i = 0; i < words.length; i++){
            wordlist.add(words[i]);
        }
        Iterator<String> te = wordlist.iterator();
        while(te.hasNext()){
            String str = te.next();
            text.append(str);
        }
    }
}
