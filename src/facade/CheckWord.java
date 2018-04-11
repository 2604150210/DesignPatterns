package facade;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class CheckWord {
    public final int basicAmount = 85;
    String advertisement;
    int amount;
    public CheckWord(String advertisement){
        this.advertisement = advertisement;
    }
    public void setChargeAmount(){
        amount = advertisement.length() + basicAmount;
    }
    public int getAmount(){
        return amount;
    }
}
