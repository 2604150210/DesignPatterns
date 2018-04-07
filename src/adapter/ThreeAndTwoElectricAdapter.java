package adapter;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class ThreeAndTwoElectricAdapter implements  TwoElectricOutlet, ThreeElectricOutlet{
    ThreeElectricOutlet threeElectricOutlet;
    TwoElectricOutlet twoElectricOutlet;
    ThreeAndTwoElectricAdapter(TwoElectricOutlet twoElectricOutlet, ThreeElectricOutlet threeElectricOutlet){
        this.twoElectricOutlet = twoElectricOutlet;
        this.threeElectricOutlet = threeElectricOutlet;
    }
    ThreeAndTwoElectricAdapter(ThreeElectricOutlet threeElectricOutlet, TwoElectricOutlet twoElectricOutlet){
        this.threeElectricOutlet = threeElectricOutlet;
        this.twoElectricOutlet = twoElectricOutlet;
    }
    @Override
    public void connectElectricCurent() {
        System.out.println("我是第2个重写方法");
        if (this instanceof ThreeElectricOutlet){
            twoElectricOutlet.connectElectricCurrent();
        }
        if (this instanceof TwoElectricOutlet){
            threeElectricOutlet.connectElectricCurent();
        }
    }
    @Override
    public void connectElectricCurrent() {
        System.out.println("我是第一个重写方法");
        if (this instanceof ThreeElectricOutlet){
            twoElectricOutlet.connectElectricCurrent();
        }
        if (this instanceof TwoElectricOutlet){
            threeElectricOutlet.connectElectricCurent();
        }
    }


}
