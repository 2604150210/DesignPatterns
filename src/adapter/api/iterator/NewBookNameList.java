package adapter.api.iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class NewBookNameList {
    LinkedList<String> bookList;
    Iterator iterator;
    NewBookNameList(Iterator iterator){
        bookList = new LinkedList<String >();
        this.iterator = iterator;
    }
    public void setBookName(){
        while (iterator.hasNext()){
            String name = (String) iterator.next();
            bookList.add(name);
        }
    }
    public void getBookName(){
        Iterator<String> iterator = bookList.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
