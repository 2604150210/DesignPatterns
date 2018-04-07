package strategy;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class GymnasticsGame {
    ComputableStrategy computableStrategy;
    public void setComputableStrategy(ComputableStrategy computableStrategy){
        this.computableStrategy = computableStrategy;
    }
    public double getPersonScore(double []a){
        if (computableStrategy != null){
            return computableStrategy.computeScore(a);
        }
        else return 0;
    }
}
