package chainOfResponsibility.factorial;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Application {
    private Handler useInt, useLong, useBig;
    public void createChain(){
        useInt = new UseInt();
        useLong = new UseLong();
        useBig = new UseBigInteger();
        useInt.setNextHandler(useLong);
        useLong.setNextHandler(useBig);
    }
    public void responseClient(String num){
        useInt.computerMultiply(num);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createChain();
        application.responseClient("10");
        System.out.println();
        application.responseClient("20");
        System.out.println();
        application.responseClient("30");
        System.out.println();
        application.responseClient("100");
        System.out.println();


    }
}
