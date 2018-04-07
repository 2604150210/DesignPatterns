package adapter.api.iterator;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class BookNameList {
    private Vector<String> vector;
    private Enumeration bookenum;
    BookNameList(){
        vector = new Vector<String>();
    }
    public void setBookName(){
        vector.add("Java 程序设计");
        vector.add("J2ME 程序设计");
        vector.add("XML 程序设计");
        vector.add("JSP 程序设计");
    }
    public Enumeration getEnumeration(){
        return vector.elements();
    }
}
