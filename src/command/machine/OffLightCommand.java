package command.machine;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class OffLightCommand implements Command {
    Light light;
    OffLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public String getName() {
        return "关闭电灯泡！";
    }
}
