package command;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class Application {
    public static void main(String[] args) {
        MakeDir makeDir = new MakeDir();//创建接受者
        Command command = new ConcreteCommand(makeDir);//创建具体命令并指定接收者
        RequestMakeDir requestMakeDir = new RequestMakeDir();
        requestMakeDir.setCommand(command);
        requestMakeDir.startExecuteCommand("jal");
        requestMakeDir.startExecuteCommand("zj");
        //requestMakeDir.undoCommand();
        requestMakeDir.undoCommand();
    }
}
