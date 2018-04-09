package abstractFactory;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class CowboyTrousers extends Trousers {
    private int waistSize;
    private int height;
    private String name;
    CowboyTrousers(String name, int chestSize, int height){
        this.name = name;
        this.waistSize = chestSize;
        this.height = height;
    }
    @Override
    public int getWaistSize() {
        return waistSize;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }
}
