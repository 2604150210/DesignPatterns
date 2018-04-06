package adapter;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class TV implements TwoElectricOutlet{
    String name;
    TV(){
        name = "长江电视机";
    }
    TV(String name){
        this.name = name;
    }
    @Override
    public void connectElectricCurrent() {
        turnOn();
    }

    private void turnOn() {
        System.out.println(name + "开始播报节目。");
    }
}
