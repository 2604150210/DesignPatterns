package observer.pull;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class CustomerOne implements Observer {
    Subject subject;
    String goodName,personName;
    CustomerOne(Subject subject,String personName){
        this.subject = subject;
        this.personName = personName;
        subject.addObserver(this);
    }
    @Override
    public void update() {
        if (subject instanceof ShopSubject){
            this.goodName = ((ShopSubject) subject).getGoodsName();
            System.out.println(personName+"只对打折商品的名字感兴趣：");
            System.out.println("打折的商品是：" + goodName);
        }
    }
}
