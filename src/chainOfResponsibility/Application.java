package chainOfResponsibility;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Application {
    private Handler beijing, shanghai, tianjin;
    public void createChain(){
        beijing = new Beijing();
        shanghai = new Shanghai();
        tianjin = new Tianjin();
        beijing.setNextHandler(shanghai);
        shanghai.setNextHandler(tianjin);
    }
    public void responseClient(String number){
        beijing.handlerRequest(number);
    }
    public static void main(String[] args) {
       Application application = new Application();
       application.createChain();
       application.responseClient("10003");
        System.out.println();
        application.responseClient("20003");
        System.out.println();
        application.responseClient("30003");
        System.out.println();
        application.responseClient("40003");
    }
}
