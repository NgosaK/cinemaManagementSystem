package ac.za.cput.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by User on 2015/04/23.
 */
public abstract class Showing<A extends Showing<A>> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String episode;
    private String season;
    private String duration;
    private String genre;
    private String title;
    private double price;

    public A setId(long idValue)
    {
        this.id=idValue;
        return (A)this;
    }


    public A setEpisode(String episodeValue)
    {
        this.episode=episodeValue;
        return (A)this;
    }

    public A setSeason(String seasonValue)
    {
        this.season= seasonValue;
        return  (A)this;
    }

    public A setTitle(String titleValue)
    {
        this.title= titleValue;
        return (A)this;
    }

    public A setDuration(String durationValue)
    {
        this.duration=durationValue;
        return (A)this;
    }

    public A setGenre(String genreValue)
    {
        this.genre=genreValue;
        return (A)this;
    }

    public A setPrice(double priceValue)
    {
        this.price=priceValue;
        return (A)this;
    }

    public String getEpisode() {
        return episode;
    }

    public String getSeason() {
        return season;
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

    public long getId() {
        return id;
    }
}
