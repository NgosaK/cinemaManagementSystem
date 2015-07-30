package ac.za.cput.services.impl;

import ac.za.cput.domain.Schedule;
import ac.za.cput.repository.ScheduleRepository;
import ac.za.cput.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OWNER on 2015/04/24.
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleRepository repository;
    public List<Schedule> getSchedules() {

        List<Schedule> allSchedules= new ArrayList<Schedule>();
        Iterable<Schedule> schedules= repository.findAll();

        for(Schedule schedule: schedules)
        {
            allSchedules.add(schedule);
        }

        return allSchedules;
    }


}
