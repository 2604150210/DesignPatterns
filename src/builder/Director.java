package builder;

import javax.swing.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class Director {
    private Builder builder;
    Director(Builder builder){
        this.builder = builder;
    }
    public JPanel constructProduct(){
        builder.buildButton();
        builder.buildLabel();
        builder.buildTextField();
        return builder.getPanel();
    }
}
