package ac.za.cput.repository;


import ac.za.cput.domain.Beverage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by OWNER on 2015/04/22.
 */
@Repository
public interface BeverageRepository extends CrudRepository<Beverage,Long>
{
    public Beverage findOne(Long code);


}
