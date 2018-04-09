package builder.calendar;

/**
 * Created by jal on 2018/4/9 0009.
 */
public interface Builder {
    void buildTitle();
    boolean buildWeekTitle();
    boolean buildCalendar(int year, int month);
    void buildDayOfMonth();
    CalendarProduct getCalendarProduct();
}
