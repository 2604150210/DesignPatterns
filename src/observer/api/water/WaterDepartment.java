package observer.api.water;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class WaterDepartment implements Observer {
    Observable subject;
    double waterVelocity;
    double waterDischarge;
    WaterDepartment(Observable subject){
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (subject instanceof WaterMessStation){
            WaterMessStation waterMessStation = (WaterMessStation) subject;
            waterVelocity = waterMessStation.getWaterVelocity();
            waterDischarge = waterMessStation.getWaterDischarge();
            System.out.println("水的流速（米/秒）：" + waterVelocity +",");
            System.out.println("流量（立方米/秒）："+waterDischarge+".");
        }
    }
}
