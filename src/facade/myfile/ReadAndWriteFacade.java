package facade.myfile;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class ReadAndWriteFacade {
    private ReadFile readFile;
    private AnalyzeInformation analyzeInformation;
    private WriteFile writeFile;
    public ReadAndWriteFacade(){
        readFile = new ReadFile();
        analyzeInformation = new AnalyzeInformation();
        writeFile = new WriteFile();
    }
    public void doOption(String readFileName, String delContent, String saveFileName){
        String content = readFile.readFileContent(readFileName);
        System.out.println("读取文件" + readFileName + "的内容：");
        System.out.println(content);
        String saveContent = analyzeInformation.getSavedContent(content,delContent);
        writeFile.writeToFile(saveFileName,saveContent);
        System.out.println("保存到文件" + saveFileName + "中的内容是：");
        System.out.println(saveContent);
    }
}
