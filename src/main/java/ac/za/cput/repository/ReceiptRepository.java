package ac.za.cput.repository;

import ac.za.cput.domain.Receipt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/07/28.
 */
@Repository
public interface ReceiptRepository extends CrudRepository<Receipt,Long> {
    @Override
    Receipt findOne(Long code);
}
