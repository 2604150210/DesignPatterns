package observer.api.water;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class Application {
    public static void main(String[] args) {
        WaterMessStation waterMessStation = new WaterMessStation();
        WaterDepartment waterDepartment = new WaterDepartment(waterMessStation);
        waterMessStation.giveMess(10,209.9);
        waterMessStation.giveMess(11,219.8);
        waterMessStation.giveMess(7,127);
    }
}
