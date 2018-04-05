package command.commandAWT;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class MultiCommand implements Command{
    ShowMultForm showMultForm;
    MultiCommand(ShowMultForm showMultForm){
        this.showMultForm = showMultForm;
    }
    @Override
    public void execute() {
        showMultForm.show();
    }

    @Override
    public String getName() {
        return "显示乘法表";
    }
}
