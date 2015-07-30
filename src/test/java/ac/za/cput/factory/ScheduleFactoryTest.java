package ac.za.cput.factory;

import ac.za.cput.conf.factory.ScheduleFactory;
import ac.za.cput.domain.Schedule;
import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2015/05/09.
 */
public class ScheduleFactoryTest {

    @Test
    public void testCreateMovie() throws Exception {

        Map<String, String> values = new HashMap<String, String>();


        values.put("title", "mad max");

        Schedule schedule = ScheduleFactory.createSchedule(values, 2, 444, 12);
        Assert.assertEquals("mad max", schedule.getTitle());
    }

    @Test
    public void testUpdateReceipt() throws Exception {
        Map<String, String> values = new HashMap<String, String>();


        values.put("title", "mad max");

        Schedule schedule = ScheduleFactory.createSchedule(values, 2, 444, 12);


        Schedule newSchedule = new Schedule
                .Builder()
                .copy(schedule)
                .build();

        Assert.assertEquals("mad max", newSchedule.getTitle());
        Assert.assertEquals(444, newSchedule.getId());
        Assert.assertEquals(12, newSchedule.getStartTime());
        Assert.assertEquals(14, newSchedule.getEndTime());
        Assert.assertEquals(2, newSchedule.getDuration());
    }

}
