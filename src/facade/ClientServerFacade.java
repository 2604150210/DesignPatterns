package facade;

import command.commandAWT.ClientUseButton;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class ClientServerFacade {
    private CheckWord checkWord;
    private Charge charge;
    private TypeSetting typeSetting;
    String advertisement;
    public ClientServerFacade(String advertisement){
        this.advertisement = advertisement;
        checkWord = new CheckWord(advertisement);
        charge = new Charge(checkWord);
        typeSetting = new TypeSetting(advertisement);
    }
    public void doAdvertisement(){
        checkWord.setChargeAmount();
        charge.giveCharge();
        typeSetting.typeSetting();
    }
}
