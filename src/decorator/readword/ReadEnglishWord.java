package decorator.readword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class ReadEnglishWord extends ReadWord {
    @Override
    public ArrayList<String> readWord(File file) {
        ArrayList<String > wordList = new ArrayList<String >();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = null;
            while ((s = bufferedReader.readLine())!=null){
                wordList.add(s);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return wordList;
    }
}
