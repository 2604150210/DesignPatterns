package command;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class RequestMakeDir {
    Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void startExecuteCommand(String name){
        command.execute(name);
    }
    public void undoCommand(){
        command.undo();
    }
}
