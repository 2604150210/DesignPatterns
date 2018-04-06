package adapter;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class Application {
    public static void main(String[] args) {
        ThreeElectricOutlet threeElectricOutlet = new Wash();
        System.out.println("使用三相插座接通电流.");
        threeElectricOutlet.connectElectricCurent();
        TV tv = new TV();
        ThreeElectricAdapter threeElectricAdapter = new ThreeElectricAdapter(tv);
        System.out.println("使用二相插座接通电源.");
        threeElectricAdapter.connectElectricCurent();
    }
}
