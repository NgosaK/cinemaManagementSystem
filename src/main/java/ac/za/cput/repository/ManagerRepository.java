package ac.za.cput.repository;

import org.apache.catalina.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by OWNER on 2015/04/22.
 */
@Repository
public interface ManagerRepository extends CrudRepository<Manager,Long> {
    @Override
    Manager findOne(Long code);
}
