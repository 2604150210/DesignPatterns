package strategy;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class StrategyTwo implements ComputableStrategy {
    @Override
    public double computeScore(double[] a) {
        double multi = 1;
        for (int i = 0; i < a.length; i++){
            multi = multi * a[i];
        }
        return Math.pow(multi,1/a.length);
    }
}
