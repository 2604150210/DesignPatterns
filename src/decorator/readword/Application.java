package decorator.readword;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String >();
        ReadEnglishWord englishWord = new ReadEnglishWord();
        WorldDecorator WD1 = new WorldDecorator(englishWord,new File("chinese.txt"));
        ReadWord reader = WD1;
        wordList = reader.readWord(new File("word.txt"));
        for(int i = 0; i < wordList.size(); i++){
            System.out.println(wordList.get(i));
        }
        WorldDecorator WD2 = new WorldDecorator(WD1,new File("englishSentence.txt"));
        reader = WD2;
        wordList = reader.readWord(new File("word.txt"));
        for (int i = 0; i < wordList.size(); i++){
            System.out.println(wordList.get(i));
        }
    }
}
