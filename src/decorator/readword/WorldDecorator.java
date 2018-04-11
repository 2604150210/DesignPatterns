package decorator.readword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class WorldDecorator extends Decorator {
    File decoratorFile;
    WorldDecorator(ReadWord reader, File decoratorFile){
        super(reader);
        this.decoratorFile = decoratorFile;
    }
    @Override
    public ArrayList<String> readWord(File file) {
        ArrayList<String> wordList = reader.readWord(file);
        try {
            FileReader inOne = new FileReader(decoratorFile);
            BufferedReader inTow = new BufferedReader(inOne);
            String s = null;
            int m = 0;
            while ((s = inTow.readLine())!= null){
                String word = wordList.get(m);
                word = word.concat(" | " + s);
                wordList.set(m,word);
                m++;
                if (m >= wordList.size())break;
            }
            inTow.close();
            inOne.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return wordList;
    }
}
