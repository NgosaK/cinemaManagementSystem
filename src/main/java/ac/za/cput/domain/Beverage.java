package ac.za.cput.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.lang.Object;import java.lang.Override;import java.lang.String;

/**
 * Created by User on 2015/04/21.
 */

@Entity
public class Beverage extends Consumables implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;
    private double volume;
    private double price;
    private String category;
    private String name;

    public long getCode() {
        return code;
    }

    public double getVolume() {
        return volume;
    }

    private Beverage()
    {

    }

    public Beverage(Builder build)
    {
        this.volume=build.volume;
        this.name=build.name;
        this.price=build.price;
        this.category=build.category;
        this.code=build.code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public static class Builder
    {
        private long code;
        private double volume;
        private double price;
        private String category;
        private String name;

        public Builder volume(double volumeValue)
        {
            this.volume= volumeValue;
            return  this;
        }

        public Builder category(String cateValue)
        {
            this.category= cateValue;
            return this;
        }

        public Builder code(long codeValue)
        {
            this.code=codeValue;
            return this;
        }

        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder name(String nameValue)
        {
            this.name=nameValue;
            return this;
        }

        public Builder copy(Beverage value)
        {
            this.category= value.category;
            this.name= value.name;
            this.price= value.price;
            this.code= value.code;
            this.volume= value.volume;
            return this;
        }

        public Beverage build()
        {
            return new Beverage(this);
        }

    }
}
