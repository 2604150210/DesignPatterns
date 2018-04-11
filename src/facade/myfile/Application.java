package facade.myfile;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Application {
    public static void main(String[] args) {
        ReadAndWriteFacade clientRacade;
        clientRacade = new ReadAndWriteFacade();
        String readFileName = "index.html";
        String delContent = "<[^>]*>";
        String savedFileName = "save.txt";
        clientRacade.doOption(readFileName,delContent,savedFileName);
    }
}
