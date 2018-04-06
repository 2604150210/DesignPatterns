package observer.pull;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class CustomerTwo implements Observer {
    Subject subject;
    double oldPrice,newPrice;
    String personName;
    CustomerTwo(Subject subject, String personName){
        this.subject = subject;
        this.personName = personName;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        if (subject instanceof ShopSubject){
            oldPrice = ((ShopSubject) subject).getOldPrice();
            newPrice = ((ShopSubject) subject).getNewPrice();
            System.out.println(personName+"只对商品的原价和折扣价感兴趣：");
            System.out.println("原价是："+oldPrice);
            System.out.println("现价是：" +newPrice);
        }
    }
}
