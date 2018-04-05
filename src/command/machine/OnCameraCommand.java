package command.machine;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class OnCameraCommand implements Command {
    Camera camera;
    OnCameraCommand(Camera camera){
        this.camera = camera;
    }
    @Override
    public void execute() {
        camera.on();
    }

    @Override
    public String getName() {
        return "打开摄像头！S";
    }
}
