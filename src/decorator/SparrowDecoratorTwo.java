package decorator;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class SparrowDecoratorTwo extends Decorator {
    private final int DISTANCE = 20;
    SparrowDecoratorTwo(Bird bird){
        super(bird);
    }
    private int elefly(){
        return DISTANCE;
    }
    @Override
    public int fly() {
        return bird.fly() + elefly();
    }
}
