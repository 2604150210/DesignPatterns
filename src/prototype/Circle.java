package prototype;

import java.awt.*;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class Circle implements Cloneable {
    private double radius;
    Point point;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setRadius(double r){
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public Object clone() throws CloneNotSupportedException {//重写clone方法
        Object object = super.clone();
        return object;
    }
}
