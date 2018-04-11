package facade.myfile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class AnalyzeInformation {
    public String getSavedContent(String content, String deleteContent){
        Pattern p;
        Matcher m;
        p = Pattern.compile(deleteContent);
        m = p.matcher(content);
        String savedContent = m.replaceAll("");
        return savedContent;
    }

}
