package flyweight;

import java.util.HashMap;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class ElementFactory {
    private HashMap<String, Element>hashMap;
    private static ElementFactory factory = new ElementFactory();
    private ElementFactory(){
        hashMap = new HashMap<String , Element>();
    }
    public static ElementFactory getFactory(){
        return factory;
    }
    public synchronized Element getElement(String key){
        if (hashMap.containsKey(key)){
            return hashMap.get(key);
        }else {
            char elementOne = '\0', elementTwo = '\0';
            elementOne = key.charAt(0);
            elementTwo = key.charAt(1);
            Element element = new TwoElement(elementOne, elementTwo);
            hashMap.put(key, element);
            return element;
        }
    }

    private class TwoElement implements Element {
        char elementOne, elementTwo;
        public TwoElement(char elementOne, char elementTwo) {
            this.elementOne = elementOne;
            this.elementTwo = elementTwo;
        }

        @Override
        public void printMess(String name, int elementOneNumber, int elementTwoNumber) {
            System.out.print(name + "由" + elementOne + "和" + elementTwo + "组成，");
            System.out.println("含有" + elementOneNumber + "个" + elementOne + "元素和"+ elementTwoNumber
            + "个" + elementTwo +"元素。");
        }
    }
}
