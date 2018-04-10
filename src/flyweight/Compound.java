package flyweight;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class Compound {
    Element element;
    String name;
    int number1, number2;

    public Compound(Element element, String name, int number1, int number2) {
        this.element = element;
        this.name = name;
        this.number1 = number1;
        this.number2 = number2;
    }
}
