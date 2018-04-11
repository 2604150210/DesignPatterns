package decorator;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class SparrowDecorator extends Decorator {
    public final int DISTANCE = 50;
    SparrowDecorator(Bird bird){
        super(bird);
    }
    @Override
    public int fly() {
        int distance = 0;
        distance = bird.fly() + elefly();
        return distance;
    }

    private int elefly() {
        return DISTANCE;
    }
}
