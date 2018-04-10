package state;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class LowState implements TemperatureState {
    double n = 0;
    LowState(double n){
        if (n <= 0)
            this.n = n;
    }
    @Override
    public void showTemperature() {
        System.out.println("现在温度是：" + n + "属于低温度");
    }
}
