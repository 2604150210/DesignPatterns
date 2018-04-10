package state;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class HeightState implements TemperatureState {
    double n = 39;
    HeightState(double n){
        if (n >= 39)
            this.n = n;
    }
    @Override
    public void showTemperature() {
        System.out.println("现在温度是：" + n + "属于高温度");
    }
}
