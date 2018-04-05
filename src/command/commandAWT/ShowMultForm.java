package command.commandAWT;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class ShowMultForm {
    public void show() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " X " + i + " = " + j * i + " ");
            }
            System.out.println("");
        }
    }
}