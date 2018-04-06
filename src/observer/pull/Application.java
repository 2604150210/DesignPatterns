package observer.pull;

import java.util.Observable;

/**
 * Created by jal on 2018/4/6 0006.
 */
public class Application {
    public static void main(String[] args) {
        ShopSubject shop = new ShopSubject();
        CustomerOne boy = new CustomerOne(shop,"zj");
        CustomerTwo girl = new CustomerTwo(shop,"jal");
        shop.setDiscountGoods("Photo数码相机",2345.9,2008.8);
        shop.setDiscountGoods("HKO手机",1234,998);
        Observable observable = new Observable();
    }
}
