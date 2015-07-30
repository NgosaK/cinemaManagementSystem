package ac.za.cput.repository;

import ac.za.cput.App;
import ac.za.cput.domain.Schedule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by OWNER on 2015/04/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudSchedule {

    private Long id = (long)1;

    @Autowired
    private ScheduleRepository repository;

    @Test
    public void testCreate() throws Exception {

        Schedule schedule= new Schedule.Builder()
                .duration(2)
                .startTime(14)
                .title("9")
                .id(485)
                .endTime()
                .build();repository.save(schedule);
        id = schedule.getId();
        Assert.assertNotNull(schedule.getTitle());

    }

    @Test
    public void testRead() throws Exception {
        Schedule schedule= repository.findOne(id);
        Assert.assertEquals(485,schedule.getId());
    }

    @Test
    public void testUpdate() throws Exception {

        Schedule schedule= repository.findOne(id);
        Schedule newSchedule= new Schedule.Builder()
                .id(885)
                .build();repository.save(newSchedule);
        Assert.assertEquals("12 15", newSchedule.getTitle());
    }

    @Test
    public void testDelete() throws Exception {
        Schedule schedule= repository.findOne(id);
        repository.delete(schedule);
        Schedule newSchedule= repository.findOne(id);

        Assert.assertNull(newSchedule);

    }

}
