package adapter;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class Wash implements ThreeElectricOutlet {
    String name ;
    Wash(){
        name = "小天鹅洗衣机";
    }
    Wash(String name){
        this.name = name;
    }

    @Override
    public void connectElectricCurent() {
        turnOn();
    }

    private void turnOn() {
        System.out.println(name + "开始洗衣物。");
    }
}
