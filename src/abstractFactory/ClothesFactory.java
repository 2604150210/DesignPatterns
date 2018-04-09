package abstractFactory;

/**
 * Created by jal on 2018/4/8 0008.
 */
public abstract class ClothesFactory {
    public abstract UpperClothes createUpperClothes(int chestSize, int height);
    public abstract Trousers createTrousers(int waistSize, int height);
}
