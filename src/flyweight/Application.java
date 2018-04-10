package flyweight;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class Application {
    public static void main(String[] args) {
        ElementFactory factory = ElementFactory.getFactory();
        String key = "CO", name;
        int number1, number2;
        Element element = factory.getElement(key);
        number1 = 1;
        number2 = 2;
        name = "二氧化碳";
        Compound compound = new Compound(element, name, number1, number2);
        element.printMess(name,number1,number2);

    }
}
