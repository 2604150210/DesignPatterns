package strategy;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Application {
    public static void main(String[] args) {
        GymnasticsGame game = new GymnasticsGame();
        game.setComputableStrategy(new StrategyOne());
        Person jal = new Person();
        jal.setName("jal");
        double []a = {9.15, 9.25, 8.87, 9.99, 6.99, 7.88};
        double []b = {9.15, 9.26, 8.87, 9.99, 6.97, 7.89};
        Person zj = new Person();
        zj.setName("zj");
        jal.setScore(game.getPersonScore(a));
        zj.setScore(game.getPersonScore(b));
        System.out.println("使用算术平均值方案：");
        System.out.println(String.format("%s最后得分：%5.3f%n",jal.getName(),jal.getScore()));
        System.out.println(String.format("%s最后得分：%5.3f%n",zj.getName(),zj.getScore()));
        game.setComputableStrategy(new StrategyTwo());
        jal.setScore(game.getPersonScore(a));
        zj.setScore(game.getPersonScore(b));
        System.out.println("使用几何平均值方案：");
        System.out.println(String.format("%s最后得分：%5.3f%n",jal.getName(),jal.getScore()));
        System.out.println(String.format("%s最后得分：%5.3f%n",zj.getName(),zj.getScore()));
        game.setComputableStrategy(new StrategyThree());
        jal.setScore(game.getPersonScore(a));
        zj.setScore(game.getPersonScore(b));
        System.out.println("使用算术平均值方案：");
        System.out.println(String.format("%s最后得分：%5.3f%n",jal.getName(),jal.getScore()));
        System.out.println(String.format("%s最后得分：%5.3f%n",zj.getName(),zj.getScore()));

    }
}
