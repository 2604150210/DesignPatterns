package factory;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class RedBallPen extends BallPen{
    @Override
    public PenCore getPenCore() {
        return new RedPenCore();
    }
}
