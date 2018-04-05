package command.machine;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class OffCameraCommand implements Command{
    Camera camera;
    OffCameraCommand(Camera camera){
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.off();
    }

    @Override
    public String getName() {
        return "关闭摄像头！";
    }
}
