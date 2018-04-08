package factory;

/**
 * Created by jal on 2018/4/8 0008.
 */
public class Application {
    public static void main(String[] args) {
        PenCore penCore;
        BallPen ballPen = new BlueBallPen();
        penCore = ballPen.getPenCore();
        penCore.writeWord("I am jal.");
        ballPen = new RedBallPen();
        penCore = ballPen.getPenCore();
        penCore.writeWord("I am zj.");
        ballPen = new BlackBallPen();
        penCore = ballPen.getPenCore();
        penCore.writeWord("I am Cathy.");
    }
}
