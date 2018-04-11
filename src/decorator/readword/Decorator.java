package decorator.readword;

/**
 * Created by jal on 2018/4/6 0006.
 */
public abstract class Decorator extends ReadWord {
    protected ReadWord reader;
    public Decorator(){

    }
    public Decorator(ReadWord reader){
        this.reader = reader;
    }
}
