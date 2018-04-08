package mediator.api.gui;

import javax.swing.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class ConcreteMediator {
    JMenu menu;
    JMenuItem copyItem, cutItem, pasteItem;
    JTextArea text;
    public void openMenu(){
        Clipboard clipboard = text.getToolkit().getSystemClipboard();
        String str = text.getSelectedText();//得到选中的文本
        if (str == null){//选中的文本为空
            copyItem.setEnabled(false);//则不允许复制
            cutItem.setEnabled(false);//则不允许粘贴
        }
        else {
            copyItem.setEnabled(true);
            cutItem.setEnabled(true);
        }
        boolean boo = clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor);
        if (boo){
            pasteItem.setEnabled(true);
        }else {
            pasteItem.setEnabled(false);
        }
    }
    public void paste(){
        text.paste();
    }
    public void copy(){
        text.copy();
    }
    public void cut(){
        text.cut();
    }
    public void registerMenu(JMenu menu){
        this.menu = menu;
    }
    public void registerPasteMenu(JMenuItem item){
        pasteItem = item;
    }
    public void registerCopyItem(JMenuItem item){
        copyItem = item;
        copyItem.setEnabled(false);
    }
    public void registerCutItem(JMenuItem item){
        cutItem = item;
        cutItem.setEnabled(false);
    }
    public void registerText(JTextArea text){
        this.text = text;
    }
}
