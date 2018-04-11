package facade;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Charge {
    public final int basicCharg = 12;
    CheckWord checkWord;
    Charge(CheckWord checkWord){
        this.checkWord = checkWord;
    }
    public void giveCharge(){
        int charge = checkWord.getAmount() * basicCharg;
        System.out.println("广告费用：" + charge + "元");
    }
}
