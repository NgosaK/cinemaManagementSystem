package ac.za.cput.repository;

import ac.za.cput.App;
import ac.za.cput.domain.Movie;
import ac.za.cput.domain.Receipt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OWNER on 2015/04/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudReceipt {

    private Long id = (long)1;

    @Autowired
    private ReceiptRepository repository;

    @Test
    public void testCreate() throws Exception {

        List<Movie> movies= new ArrayList<Movie>();
        Receipt receipt= new Receipt.Builder()
                .movieTitle(movies)
                .price(65.00)
                .item("movie")
                .quantity(2)
                .cashierName("Tom")
                .id(748)
                .total()
                .build();repository.save(receipt);
        id = receipt.getId();
        Assert.assertNotNull(receipt.getCashierName());

    }

    @Test
    public void testRead() throws Exception {
        Receipt receipt= repository.findOne(id);

        Assert.assertEquals(748,receipt.getId());
    }

    @Test
    public void testUpdate() throws Exception {

        Receipt receipt= repository.findOne(id);
        Receipt newReceipt= new Receipt.Builder()
                .id(545)
                .build();
        repository.save(newReceipt);
        Assert.assertEquals(545,newReceipt.getId());
    }

    @Test
    public void testDelete() throws Exception {
        Receipt receipt= repository.findOne(id);
        repository.delete(receipt);
        Receipt newReceipt= repository.findOne(id);

        Assert.assertNull(newReceipt);

    }

}
