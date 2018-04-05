package command;

import java.util.ArrayList;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class ConcreteCommand implements Command{
    ArrayList<String>dirNameList;//记录复制和撤销的栈操作次序
    MakeDir makeDir;
    ConcreteCommand(MakeDir makeDir){
        dirNameList = new ArrayList<String>();
        this.makeDir = makeDir;
    }
    @Override
    public void execute(String name) {
        makeDir.createDir(name);
        dirNameList.add(name);
    }

    @Override
    public void undo() {
        if(dirNameList.size()>0){
            makeDir.deleteDir(dirNameList.get(dirNameList.size()-1));
            dirNameList.remove(dirNameList.size()-1);
        }else {
            System.out.println("没有需要撤销的操作！");
        }
    }
}
