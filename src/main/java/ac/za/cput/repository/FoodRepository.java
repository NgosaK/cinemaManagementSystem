package ac.za.cput.repository;

import ac.za.cput.domain.Customer;
import ac.za.cput.domain.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by OWNER on 2015/04/22.
 */
@Repository
public interface FoodRepository extends CrudRepository<Food,Long> {

    public Food findOne(Long code);
}
