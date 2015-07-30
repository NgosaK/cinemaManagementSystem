package ac.za.cput.repository;

import ac.za.cput.domain.TVShow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by OWNER on 2015/04/22.
 */
@Repository
public interface TVShowRepository extends CrudRepository<TVShow,Long> {
    @Override
    public TVShow findOne(Long code);
}
