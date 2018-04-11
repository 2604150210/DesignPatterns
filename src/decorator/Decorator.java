package decorator;

/**
 * Created by jal on 2018/4/6 0006.
 */
public abstract class Decorator extends Bird {
    protected Bird bird;
    public Decorator(){

    }
    public Decorator(Bird bird){
        this.bird = bird;
    }

}
