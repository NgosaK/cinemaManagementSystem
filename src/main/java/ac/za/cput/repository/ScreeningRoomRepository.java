package ac.za.cput.repository;

import ac.za.cput.domain.ScreeningRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/07/28.
 */
@Repository
public interface ScreeningRoomRepository extends CrudRepository<ScreeningRoom,Long> {
    @Override
    ScreeningRoom findOne(Long code);
}
