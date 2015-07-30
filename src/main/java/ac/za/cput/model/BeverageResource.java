package ac.za.cput.model;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by User on 2015/07/27.
 */
public class BeverageResource extends ResourceSupport {

    private Long code;
    private double volume;
    private double price;
    private String category;
    private String name;

    private BeverageResource() {
    }

    public long getcode() {
        return code;
    }

    public double getVolume() {
        return volume;
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

    public BeverageResource(Builder build) {
        this.volume = build.volume;
        this.name = build.name;
        this.price = build.price;
        this.category = build.category;
        this.code = build.code;
    }


    public static class Builder {
        private Long code;
        private double volume;
        private double price;
        private String category;
        private String name;

        public Builder volume(double volumeValue) {
            this.volume = volumeValue;
            return this;
        }

        public Builder category(String cateValue) {
            this.category = cateValue;
            return this;
        }

        public Builder code(Long codeValue) {
            this.code = codeValue;
            return this;
        }

        public Builder price(double priceValue) {
            this.price = priceValue;
            return this;
        }

        public Builder name(String nameValue) {
            this.name = nameValue;
            return this;
        }

        public Builder copy(BeverageResource value) {
            this.category = value.category;
            this.name = value.name;
            this.price = value.price;
            this.code = value.code;
            this.volume = value.volume;
            return this;
        }

        public BeverageResource build() {
            return new BeverageResource(this);
        }
    }

}
