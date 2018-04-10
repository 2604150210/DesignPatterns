package proxy;

import java.util.Scanner;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数，每输入一个数回车确认");
        double a = -1, b = -1, c = -1;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        TriangleProxy proxy = new TriangleProxy();
        proxy.setABC(a, b, c);
        double area = proxy.getArea();
        System.out.println("面积是：" + area);
    }
}
