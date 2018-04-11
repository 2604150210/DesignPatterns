package visitor;

/**
 * Created by jal on 2018/4/11 0011.
 */
public interface Visitor {
    void visit(Undergraduate stu);
    void visit(GraduateStudent stu);
}
