package ac.za.cput.repository;

import ac.za.cput.App;
import ac.za.cput.domain.Beverage;
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
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudBeverage {


    private Long id = (long)1;

    @Autowired
    BeverageRepository repository;

    @Test
    public void testCreate() throws Exception {


        Beverage beverage= new Beverage.Builder().volume(15.00).
                price(10.00).category("Candy").code(768).name("whispers")
                .build();
        repository.save(beverage);
        id = beverage.getCode();
        Assert.assertNotNull(beverage.getCode());

    }


    @Test
    public void testRead() throws Exception {
        Beverage beverage= repository.findOne(id);
        Assert.assertEquals("cream soda",beverage.getName());
    }

    @Test
    public void testUpdate() throws Exception {

        Beverage beverage= repository.findOne(id);
        Beverage newBeverage= new Beverage.Builder().category("Soda")
                .name("cream soda").code( 384).price(15.00).volume(300.50)
                .build();
        repository.save(newBeverage);
        Assert.assertEquals("cream soda",beverage.getName());
    }

    @Test
    public void testDelete() throws Exception {
        Beverage beverage= repository.findOne(id);
        repository.delete(beverage);
        Beverage newBeverage= repository.findOne(id);
        Assert.assertNull(newBeverage);

    }


}
