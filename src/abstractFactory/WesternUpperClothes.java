package abstractFactory;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class WesternUpperClothes extends UpperClothes {
    private int chestSize;
    private int height;
    private String name;
    WesternUpperClothes(String name, int chestSize, int height){
        this.name = name;
        this.chestSize = chestSize;
        this.height = height;
    }
    @Override
    public int getChestSize() {
        return chestSize;
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
