package composite;

import java.util.Iterator;

/**
 * Created by jal on 2018/4/10 0010.
 */
public class Computer {
    public static double computerWeight(TreeComponent node){
        double weightSum = 0;
        if (node.isLeaf()){
            weightSum += node.getWeight();
        }
        else {
            weightSum += node.getWeight();
            Iterator<TreeComponent> iterator = node.getAllChildren();
            while (iterator.hasNext()){
                TreeComponent p = iterator.next();
                weightSum += computerWeight(p);
            }
        }
        return weightSum;
    }
    public static double computerValue(TreeComponent node, double unit){
        double appleWorth = 0;
        if (node.isLeaf()){
            appleWorth += node.getWeight() * unit;
        }
        else {
            Iterator<TreeComponent>iterator = node.getAllChildren();
            while (iterator.hasNext()){
                TreeComponent p = iterator.next();
                appleWorth += computerValue(p, unit);
            }
        }
        return appleWorth;
    }

    public static String getAllChildrenName(TreeComponent node){
        StringBuffer mess = new StringBuffer();
        if (node.isLeaf()){
            mess.append(" " + node.toString());
        }
        else {
            mess.append(" " + node.toString());
            Iterator<TreeComponent>iterator = node.getAllChildren();
            while (iterator.hasNext()){
                TreeComponent p = iterator.next();
                mess.append(" " + getAllChildrenName(p));
            }
        }
        return new String(mess);
    }
}
