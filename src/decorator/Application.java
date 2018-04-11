package decorator;

import java.io.FileReader;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class Application {
    public void needBird(Bird bird){
        int flyDistance = bird.fly();
        System.out.println("这只鸟能飞行"+flyDistance+"米.");
    }
    public static void main(String[] args) {
        Application client = new Application();
        Bird sparrow = new Sparrow();
        Bird sparrowDecorator3 = new SparrowDecoratorTwo(sparrow);
        Bird sparrowDecorator4 = new SparrowDecorator(sparrowDecorator3);
        Bird sparrowDecorator5 = new SparrowDecorator(sparrowDecorator4);
        Bird sparrowDecorator6 = new SparrowDecoratorTwo(sparrowDecorator5);
        client.needBird(sparrowDecorator3);
        client.needBird(sparrowDecorator4);
        client.needBird(sparrowDecorator5);
        client.needBird(sparrowDecorator6);
    }
}
