package prototype;

import java.awt.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class Example {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(0.618);
        circle.setPoint(new Point(2,3));
        try {
            Circle circleCopy = (Circle) circle.clone();
            System.out.println("circle对象中的数据："  +circle.getRadius()+"   "+circle.getPoint());
            System.out.println("circleClone对象中的数据" +circleCopy.getRadius()+"   " +circle.getPoint() );
            circleCopy.setRadius(3.14);
            circleCopy.setPoint(new Point(1,2));
            System.out.println("circle对象中的数据："  +circle.getRadius()+"   " +circle.getPoint() );
            System.out.println("circleClone对象中的数据"+circleCopy.getRadius()+"   " +circle.getPoint() );
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
//        输出结果：
//        circle对象中的数据：0.618   java.awt.Point[x=2,y=3]
//        circleClone对象中的数据0.618   java.awt.Point[x=2,y=3]
//        circle对象中的数据：0.618   java.awt.Point[x=2,y=3]
//        circleClone对象中的数据3.14   java.awt.Point[x=2,y=3]
        //可见对象成员是浅克隆
    }
}
