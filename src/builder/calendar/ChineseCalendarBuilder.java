package builder.calendar;

import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class ChineseCalendarBuilder implements Builder {
    private CalendarProduct product;
    ChineseCalendarBuilder(){
        product = new CalendarProduct();
    }
    @Override
    public void buildTitle() {
        product.title = product.year + "年" + product.month + "月的日历牌";
    }

    @Override
    public boolean buildWeekTitle() {
        String [] s = {
                "一", "二", "三","四", "五", "六" ,"日"
        };
        product.weekTitle = s;
        if (s.length == 7)return true;
        else
        return false;
    }

    @Override
    public boolean buildCalendar(int year, int month) {
        product.year = year;
        product.month = month;
        if (month >= 1 && month <= 12){
            product.calendar = Calendar.getInstance();
            product.calendar.set(year, month -1 , 1);
            return true;
        }else
        return false;
    }

    @Override
    public void buildDayOfMonth() {
        int isWeekDay = product.calendar.get(Calendar.DAY_OF_WEEK) - 1;
        isWeekDay = (isWeekDay + 7 ) % 7;
        int day = 0;
        int m = product.month;
        int y = product.year;
        if(m == 1|| m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            day = 31;
        }
        else if(m == 4 || m == 6 || m == 9||m == 11){
            day = 30;
        }else if(m == 2){
            if(((y % 4 == 0) && (y % 100 != 0) ) || (y % 400 == 0)){
                day = 29;
            }else {
                day = 28;
            }
        }
        int nextDay = 1;
        String [][] a = new String [6][7];
        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 7; j++){
                a[i][j] = "";
            }
        }
        for(int i = 0; i < 6; i++){
            if(i == 0){
                for(int j = (isWeekDay-1 + 7) % 7; j < 7; j++){
                    a[i][j] = "" + nextDay;
                    nextDay ++;
                }
            }else {
                for(int j = 0; j < 7 && nextDay <= day; j++){
                    a[i][j] = "" + nextDay;
                    nextDay ++;
                }
            }
        }
        product.dayOfMonth = a;
    }

    @Override
    public CalendarProduct getCalendarProduct() {
        return product;
    }
}
