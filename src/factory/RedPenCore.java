package factory;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class RedPenCore extends PenCore {
    RedPenCore(){
        color = "红色";
    }
    @Override
    public void writeWord(String string) {
        System.out.println("写出" + color + "的字：" + string);
    }
}
