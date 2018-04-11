package decorator;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class Sparrow extends Bird {
    public final int DISTANCE = 100;
    @Override
    public int fly() {
        return DISTANCE;
    }
}
