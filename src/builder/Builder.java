package builder;

import javax.swing.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public interface Builder {
    void buildButton();
    void buildLabel();
    void buildTextField();
    JPanel getPanel();
}
