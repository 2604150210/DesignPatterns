package builder.calendar;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class Application {
    public static void main(String[] args) {
        Builder builder = new ChineseCalendarBuilder();
        Director director = new Director(builder,2018, 4);
        director.constructProduct();
        builder = new AmericanCalendarBuilder();
        director = new Director(builder, 2018, 3);
        director.constructProduct();
    }
}
