package mediator.api.gui;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class Application extends JFrame {
    ConcreteMediator mediator;
    JMenuBar bar;
    JMenu menu;
    JMenuItem copyItem, cutItem, pasteItem;
    JTextArea text;
    Application(){
        mediator = new ConcreteMediator();
        bar = new JMenuBar();
        menu = new JMenu("编辑");
        menu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                mediator.openMenu();
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        copyItem = new JMenuItem("复制");
        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.copy();
            }
        });
        cutItem = new JMenuItem("剪切");
        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.cut();
            }
        });
        pasteItem = new JMenuItem("粘贴");
        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.paste();
            }
        });
        text = new JTextArea();
        bar.add(menu);
        menu.add(copyItem);
        menu.add(cutItem);
        menu.add(pasteItem);
        setJMenuBar(bar);
        add(text, BorderLayout.CENTER);
        this.register();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void register() {
        mediator.registerMenu(menu);
        mediator.registerCopyItem(copyItem);
        mediator.registerCutItem(cutItem);
        mediator.registerPasteMenu(pasteItem);
        mediator.registerText(text);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.setBounds(100, 200, 300, 400);
        application.setVisible(true);
    }
}
