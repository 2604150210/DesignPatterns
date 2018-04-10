package state;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class MiddleState implements TemperatureState {
    double n = 15;
    MiddleState(double n){
        if (n > 0 && n < 26)
            this.n = n;
    }
    @Override
    public void showTemperature() {
        System.out.println("现在温度是：" + n + "属于正常温度");
    }
}
