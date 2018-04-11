package visitor;

/**
 * Created by jal on 2018/4/11 0011.
 */
public class Undergraduate extends Student {
    double math, english;
    String name;

    public Undergraduate(double math, double english, String name) {
        this.math = math;
        this.english = english;
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
