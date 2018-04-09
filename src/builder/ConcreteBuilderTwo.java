package builder;

import javax.swing.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class ConcreteBuilderTwo implements Builder {
    private PanelProduct panel;
    ConcreteBuilderTwo(){
        this.panel = new PanelProduct();
    }
    @Override
    public void buildButton() {
        panel.button = new JButton("button");
    }

    @Override
    public void buildLabel() {
        panel.label = new JLabel("label");
    }

    @Override
    public void buildTextField() {
        panel.textField = new JTextField("textField");
    }

    @Override
    public JPanel getPanel() {
        panel.add(panel.textField);
        panel.add(panel.label);
        panel.add(panel.button);
        return panel;
    }
}
