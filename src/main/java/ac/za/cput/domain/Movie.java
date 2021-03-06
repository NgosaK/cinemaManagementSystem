package ac.za.cput.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 2015/04/21.
 */
@Entity

public class Movie extends Showing  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private long id;
    private String duration;
    private String genre;
    private String title;
    private double price;
    private String type;

    public long getId() {
        return id;
    }
    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    private Movie() {

    }

    public Movie(Builder build)
    {
        this.duration=build.duration;
        this.genre= build.genre;
        this.title= build.title;
        this.price=build.price;
        this.type= build.type;
        this.id=build.id;
    }

    public static class Builder
    {
        private String duration;
        private String genre;
        private String title;
        private double price;
        private  String type;
        private long id;

        public Builder id(long idValue)
        {
            this.id=idValue;
            return this;
        }

        public Builder duration(String durationValue)
        {
            this.duration= durationValue;
            return this;
        }

        public Builder genre (String genreValue)
        {
            this.genre= genreValue;
            return this;
        }

        public Builder title (String titleValue)
        {
            this.title= titleValue;
            return this;
        }

        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder type(String typeValue)
        {
            this.type=typeValue;
            return this;
        }

        public Builder copy(Movie value)
        {
            this.id=value.id;
            this.type=value.type;
            this.price=value.price;
            this.title= value.title;
            this.duration=value.duration;
            this.genre=value.genre;

            return this;
        }
        public Movie build()
        {
            return new Movie(this);
        }


    }
}
