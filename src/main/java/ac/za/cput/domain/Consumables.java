package ac.za.cput.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by User on 2015/04/23.
 */
public abstract class Consumables<A extends Consumables<A>> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;
    private double volume;
    private double price;
    private String category;
    private String name;
    private double weight;

    public A setVolume(double volumeValue)
    {
        this.volume= volumeValue;
        return  (A)this;
    }

    public A setCategory(String cateValue)
    {
        this.category= cateValue;
        return (A)this;
    }

    public A setCode(long codeValue)
    {
        this.code=codeValue;
        return (A)this;
    }

    public A setPrice(double priceValue)
    {
        this.price=priceValue;
        return (A)this;
    }

    public A setName(String nameValue)
    {
        this.name=nameValue;
        return (A)this;
    }


    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
