package composite;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class Apple implements TreeComponent {
    LinkedList<TreeComponent> list;
    double weight;
    String name;
    Apple(String name, double weight){
        this.name = name;
        this.weight = weight;
        list = new LinkedList<TreeComponent>();
    }
    @Override
    public void add(TreeComponent node) {

    }

    @Override
    public void remove(TreeComponent node) {

    }

    @Override
    public TreeComponent getChild(int index) {
        return null;
    }

    @Override
    public Iterator<TreeComponent> getAllChildren() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public double getWeight() {
        return weight;
    }
    public String toString(){
        return name;
    }
}
