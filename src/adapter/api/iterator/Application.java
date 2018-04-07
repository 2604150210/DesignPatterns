package adapter.api.iterator;

import java.util.Enumeration;

/**
 * Created by jal on 2018/4/7 0007.
 */
public class Application {
    public static void main(String[] args) {
        BookNameList oldBookList = new BookNameList();
        oldBookList.setBookName();
        Enumeration bookenum = oldBookList.getEnumeration();
        IteratorAdapter adapter = new IteratorAdapter(bookenum);
        NewBookNameList newBookNameList = new NewBookNameList(adapter);
        newBookNameList.setBookName();
        System.out.println("导入到新系统中的图书列表：");
        newBookNameList.getBookName();
    }
}
