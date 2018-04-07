package strategy;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class StrategyOne implements ComputableStrategy {
    @Override
    public double computeScore(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum / a.length;
    }
}
