package ac.za.cput.repository;

import ac.za.cput.domain.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by OWNER on 2015/04/22.
 */
@Repository
public interface ScheduleRepository extends CrudRepository<Schedule,Long> {
    @Override
    public Schedule findOne(Long code);
}
