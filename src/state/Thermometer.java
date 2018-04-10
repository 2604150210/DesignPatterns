package state;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class Thermometer {
    private TemperatureState state;
    void showMessage(){
        System.out.println("***************");
        state.showTemperature();
        System.out.println("***************");
    }
    public void setState(TemperatureState state){
        this.state = state;
    }
}
