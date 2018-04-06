package observer.push;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by jal on 2018/4/5 0005.
 */
public class UniversityStudent implements Observer {
    Subject subject;
    File myFile;
    UniversityStudent(Subject subject, String fileName){
        this.subject = subject;
        subject.addObserver(this);
        myFile = new File(fileName);
    }
    @Override
    public void hearTelephone(String heardMess) {
        try {
            RandomAccessFile out = new RandomAccessFile(myFile,"rw");
            out.seek(out.length());
            byte[]b = heardMess.getBytes();
            out.write(b);
            System.out.println("I am a student.");
            System.out.println("我向文件"+myFile.getName()+"写入如下内容：");
            System.out.println(heardMess);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
