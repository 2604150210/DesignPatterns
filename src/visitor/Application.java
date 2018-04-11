package visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jal on 2018/4/11 0011.
 */
public class Application {
    public static void main(String[] args) {
        Visitor visitor = new Company();
        ArrayList<Student>studentList = new ArrayList<Student>();
        Student student = new Undergraduate(100, 100,"jal");
        studentList.add(student);
        student = new Undergraduate(80, 90,"fxl");
        studentList.add(student);
        student = new Undergraduate(70, 90,"ylt");
        studentList.add(student);
        student = new GraduateStudent(100, 100, 100, "zj");
        studentList.add(student);
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            s.accept(visitor);
        }
    }
}
