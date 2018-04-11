package facade;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Application {
    public static void main(String[] args) {
        ClientServerFacade clientFacade;
        String clientAdvertisement = "联想电脑，价格3000元，联系电话：188****2520";
        clientFacade = new ClientServerFacade(clientAdvertisement);
        clientFacade.doAdvertisement();
    }
}
