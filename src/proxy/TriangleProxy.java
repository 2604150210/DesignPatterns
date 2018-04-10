package proxy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class TriangleProxy implements Geometry {
    double sideA, sideB, sideC;
    Triangle triangle;

    public void setABC(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double []a = new double[3];
        a[0] = sideA;
        a[1] = sideB;
        a[2] = sideC;
        Arrays.sort(a);
        if (a[0] + a[1] > a[2] && a[2] - a[0] < a[1]){
            triangle = new Triangle(sideA, sideB,sideC);
            double area = triangle.getArea();
            return area;
        }
        else return -1;
    }
}
