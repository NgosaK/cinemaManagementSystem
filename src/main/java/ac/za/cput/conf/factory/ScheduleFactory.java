package ac.za.cput.conf.factory;

import ac.za.cput.domain.Schedule;

import java.util.Map;
/**
 * Created by User on 2015/05/01.
 */
public class ScheduleFactory {

    public static Schedule createSchedule(
            Map<String,String>values, int duration, long
            id, int startTime)
    {
        Schedule schedule= new Schedule
                .Builder()
                .id(id)
                .title(values.get("title"))
                .duration(duration)
                .startTime(startTime)
                .endTime()
                .build();

        return schedule;
    }

}
