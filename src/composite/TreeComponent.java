package composite;

import java.util.Iterator;

/**
 * Created by jal on 2018/4/10 0010.
 */
public interface TreeComponent {
    void add(TreeComponent node);
    void remove(TreeComponent node);
    TreeComponent getChild(int index);
    Iterator<TreeComponent> getAllChildren();
    boolean isLeaf();
    double getWeight();
}
