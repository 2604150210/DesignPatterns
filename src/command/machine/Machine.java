package command.machine;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class Machine extends JFrame {
    Invoke requestOnCamera,requestOffCamera,requestOnLight,requestOffLight;
    Camera camera;
    Light light;
    Machine(){
        setTitle("小电器");
        requestOnCamera = new Invoke();
        requestOffCamera = new Invoke();
        requestOnLight = new Invoke();
        requestOffLight = new Invoke();
        camera = new Camera();
        light = new Light();
        requestOnCamera.setCommand(new OnCameraCommand(camera));
        requestOffCamera.setCommand(new OffCameraCommand(camera));
        requestOnLight.setCommand(new OnLightCommand(light));
        requestOffLight.setCommand(new OffLightCommand(light));
        initPosition();
        setSize(200,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initPosition() {
        JPanel pSourth = new JPanel();
        pSourth.add(requestOnCamera.getButton());
        pSourth.add(requestOffCamera.getButton());
        pSourth.add(requestOnLight.getButton());
        pSourth.add(requestOffLight.getButton());
        add(pSourth, BorderLayout.SOUTH);
        JPanel pNorth = new JPanel();
        pNorth.add(light);
        add(pNorth,BorderLayout.NORTH);
        JPanel pCenter = new JPanel();
        pCenter.add(camera);
        add(pCenter,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Machine();
    }
}
