package ac.za.cput.conf.factory;

/**
 * Created by User on 2015/04/29.
 */

import ac.za.cput.domain.Beverage;

import java.util.Map;
public class BeverageFactory {

    public static Beverage createBeverage(
        Map<String,String>values, long code, double
        price, double volume) {
        Beverage beverage = new Beverage
                .Builder()
                .code(code)
                .name(values.get("name"))
                .category(values.get("category"))
                .price(price)
                .volume(volume)
                .build();

    return beverage;

    }

}
