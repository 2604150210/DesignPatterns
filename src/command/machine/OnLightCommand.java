package command.machine;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class OnLightCommand implements Command {
    Light light;
    OnLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public String getName() {
        return "打开电灯泡！";
    }
}
