package adapter.api.iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class IteratorAdapter implements Iterator {
    Enumeration bookenum;
    IteratorAdapter(Enumeration bookenum){
        this.bookenum = bookenum;
    }
    @Override
    public boolean hasNext() {
        return bookenum.hasMoreElements();
    }

    @Override
    public Object next() {
        return bookenum.nextElement();
    }

    @Override
    public void remove() {
        System.out.println("枚举器没有删除集合元素的方法。");
    }
}
