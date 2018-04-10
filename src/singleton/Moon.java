package singleton;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class Moon {
    private static Moon uniqueMoon;
    double radius;
    double distanceToEarth;
    private Moon(){
        uniqueMoon = this;
        radius = 1728;
        distanceToEarth = 363300;
    }
    public static synchronized Moon getMoon(){
        if (uniqueMoon != null){
            uniqueMoon = new Moon();
        }
        return uniqueMoon;
    }
    public String show(){
        //String s= "月亮的半径是：" + radius + "km， 距离地球是：" + distanceToEarth;
        return "MOON";
    }
}
