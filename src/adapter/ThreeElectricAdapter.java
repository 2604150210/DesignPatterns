package adapter;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class ThreeElectricAdapter implements ThreeElectricOutlet {
    TwoElectricOutlet twoElectricOutlet;
    ThreeElectricAdapter(TwoElectricOutlet twoElectricOutlet){
        this.twoElectricOutlet = twoElectricOutlet;
    }
    @Override
    public void connectElectricCurent() {
        twoElectricOutlet.connectElectricCurrent();
    }
}
