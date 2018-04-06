package observer.push;

/**
 * Created by jal on 2018/4/5 0005.
 */
public class Application {
    public static void main(String[] args) {
        SeekJobCenter center = new SeekJobCenter();
        UniversityStudent jal = new UniversityStudent(center,"A.txt");
        ReturnedScholars Cathy = new ReturnedScholars(center,"B.txt");
        center.giveNewMess("腾辉公司需要10个java程序员。");
        center.notifyObservers();
        center.giveNewMess("海景公司需要8个动画设计师。");
        center.notifyObservers();
        center.giveNewMess("仁海公司需要9个电工。");
        center.notifyObservers();
        center.giveNewMess("仁海公司需要9个电工。");
        center.notifyObservers();

    }
}
