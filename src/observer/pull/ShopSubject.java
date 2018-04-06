package observer.pull;

import java.util.ArrayList;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class ShopSubject implements Subject {
    String goodsName;
    double oldPrice,newPrice;
    ArrayList<Observer> customerList;
    ShopSubject(){
        customerList = new ArrayList<Observer>();
    }
    @Override
    public void addObserver(Observer o) {
        if (!(customerList.contains(o)));
        customerList.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        if (customerList.contains(o))
            customerList.remove(o);
    }


    @Override
    public void notifyObservers() {
        for(int i = 0; i < customerList.size(); i++){
            Observer observer = customerList.get(i);
            observer.update();
        }
    }

    public  void setDiscountGoods(String name, double oldPrice, double newPrice){
        this.goodsName = name;
        this.oldPrice  = oldPrice;
        this.newPrice = newPrice;
        notifyObservers();
    }

    public String getGoodsName(){
        return this.goodsName;
    }

    public double getOldPrice(){
        return this.oldPrice;
    }

    public double getNewPrice(){
        return this.newPrice;
    }
}
