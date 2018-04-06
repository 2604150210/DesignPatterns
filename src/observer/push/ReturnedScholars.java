package observer.push;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by jal on 2018/4/5 0005.
 */
public class ReturnedScholars implements Observer {
    Subject subject;
    File myFile;
    ReturnedScholars(Subject subject, String fileName){
        this.subject = subject;
        subject.addObserver(this);
        myFile = new File(fileName);
    }
    @Override
    public void hearTelephone(String heardMess) {
        try {
            boolean boo = heardMess.contains("java程序员")||heardMess.contains("软件");
            if (boo){
                RandomAccessFile out = new RandomAccessFile(myFile,"rw");
                out.seek(out.length());
                byte[]b = heardMess.getBytes();
                out.write(b);
                System.out.println("I am a returned scholar.");
                System.out.println("我向文件"+myFile.getName()+"写入如下内容：");
                System.out.println(heardMess);
            }
            else {
                System.out.println("I am a returned scholar, there is not ther message I need.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
