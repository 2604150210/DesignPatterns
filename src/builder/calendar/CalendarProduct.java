package builder.calendar;

import javax.swing.*;
import java.util.Calendar;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class CalendarProduct {
    Calendar calendar;
    String title;
    String[] weekTitle;
    String [][] dayOfMonth;
    int year = 2008, month = 1;
    public void showCalendarPad(){
        JTable table;
        table = new JTable(dayOfMonth, weekTitle);
        JDialog dialog = new JDialog();
        dialog.setTitle(title);
        dialog.add(new JScrollPane(table));
        dialog.setBounds(130, 160, 220, 180);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
