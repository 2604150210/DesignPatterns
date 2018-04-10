package bridge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class Application extends JFrame {
    JButton seeProgram;
    CCTV cctv;
    Program program;
    Application(CCTV cctv, Program program){
        this.cctv = cctv;
        this.program = program;
        add(cctv, BorderLayout.CENTER);
        seeProgram = new JButton("看节目");
        add(seeProgram,BorderLayout.SOUTH);
        seeProgram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cctv.makeProgram();
            }
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        Program program = new AthleticProgram();
        CCTV cctv = new CCTV5(program);
        Application application = new Application(cctv, program);
        application.setBounds(10, 10, 200, 300);
        program = new FilmProgram();
        cctv = new CCTV6(program);
        Application application1 = new Application(cctv, program);
        application1.setBounds(220, 10, 200, 300);
    }
}
