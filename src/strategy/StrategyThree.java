package strategy;

import java.util.Arrays;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class StrategyThree implements ComputableStrategy {
    @Override
    public double computeScore(double[] a) {
        if (a.length <= 2){
            return 0;
        }
        double sum = 0;
        Arrays.sort(a);
        for (int i = 1; i < a.length - 1; i++){
            sum += a[i];
        }
        return sum / (a.length-2);
    }
}
