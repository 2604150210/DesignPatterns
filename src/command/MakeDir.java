package command;

import java.io.File;

/**
 * Created by jal on 2018/4/4 0004.
 */
public class MakeDir {
    public void createDir(String name){
        File dir = new File(name);
        dir.mkdir();
    }
    public void deleteDir(String name){
        File dir = new File(name);
        dir.delete();
    }
}
