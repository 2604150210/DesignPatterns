package visitor;

/**
 * Created by jal on 2018/4/11 0011.
 */
public class GraduateStudent extends Student {
    double math, english, physics;
    String name;

    public GraduateStudent(double math, double english, double physics, String name) {
        this.math = math;
        this.english = english;
        this.physics = physics;
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public double getPhysics() {
        return physics;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
