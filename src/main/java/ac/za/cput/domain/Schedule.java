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

public class Schedule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int duration ;
    private String title;
    private int startTime;
    private int endTime;

    public int getEndTime() {
        return endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Schedule(Builder build)
    {
        this.duration= build.duration;
        this.title= build.title;
        this.startTime= build.startTime;
        this.endTime= build.endTime;
        this.id=build.id;
    }

    public static class Builder
    {
        private int duration ;
        private String title;
        private int startTime;
        private int endTime;
        private long id;

        public Builder id(long idValue)
        {
            this.id=idValue;
            return this;
        }

        public Builder duration(int durationValue)
        {
            this.duration= durationValue;
            return this;
        }

        public Builder title(String titleValue)
        {
            this.title= titleValue;
            return this;
        }

        public Builder startTime(int startTimeValue)
        {

            this.startTime= startTimeValue;
            return this;
        }

        public Builder endTime()
        {
            this.endTime=0;
            this.endTime= startTime + duration;
            return this;
        }

       public Builder copy(Schedule value)
        {
            this.endTime= value.endTime;
            this.startTime= value.startTime;
            this.id=value.id;
            this.title= value.title;
            this.duration= value.duration;
            return this;
        }

        public Schedule build()
        {
            return new Schedule(this);
        }

    }
}
