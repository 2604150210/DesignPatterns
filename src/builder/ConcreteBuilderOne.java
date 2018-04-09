package builder;

import javax.swing.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class ConcreteBuilderOne implements Builder {
    private PanelProduct panel;
    ConcreteBuilderOne(){
        this.panel = new PanelProduct();
    }
    @Override
    public void buildButton() {
        panel.button = new JButton("按钮");
    }

    @Override
    public void buildLabel() {
        panel.label = new JLabel("标签");
    }

    @Override
    public void buildTextField() {
        panel.textField = new JTextField("文本框");
    }

    @Override
    public JPanel getPanel() {
        panel.add(panel.button);
        panel.add(panel.label);
        panel.add(panel.textField);
        return panel;
    }
}
