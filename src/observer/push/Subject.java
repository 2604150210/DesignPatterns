package observer.push;

/**
 * Created by jal on 2018/4/5 0005.
 */
public interface Subject {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers();
}
