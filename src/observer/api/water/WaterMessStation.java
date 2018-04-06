package observer.api.water;

import java.util.Observable;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class WaterMessStation extends Observable {
    double waterVelocity;
    double waterDischarge;
    public void giveMess(double waterVelocity,double waterDischarge){
        if (this.waterVelocity != waterVelocity || this.waterDischarge != waterDischarge) {
            setChanged();
        }
        this.waterVelocity = waterVelocity;
        this.waterDischarge = waterDischarge;
        notifyObservers();
    }

    public double getWaterVelocity() {
        return waterVelocity;
    }

    public double getWaterDischarge() {
        return waterDischarge;
    }
}
