package ac.za.cput.repository;

import ac.za.cput.App;
import ac.za.cput.domain.Food;
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
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudFood {


    private Long id = (long)1;

    @Autowired
    private FoodRepository repository;

    @Test
    public void testCreate() throws Exception {

        Food food= new Food.Builder()
                .category("snack")
                .name("popcorn")
                .weight(200.00)
                .price(30.00)
                .code(849)
                .build();
        repository.save(food);
        id = food.getCode();
        Assert.assertNotNull(food.getName());

    }

    @Test
    public void testRead() throws Exception {
        Food food= repository.findOne(id);

        junit.framework.Assert.assertEquals(849, food.getCode());
    }

    @Test
    public void testUpdate() throws Exception {

        Food food = repository.findOne(id);
        Food newFood= new Food.Builder()
                .code(999)
                .build();
        repository.save(newFood);
        junit.framework.Assert.assertEquals(999, newFood.getCode());
    }

    @Test
    public void testDelete() throws Exception {
        Food food= repository.findOne(id);
        repository.delete(food);
        Food newFood= repository.findOne(id);

        junit.framework.Assert.assertNull(newFood);

    }
}
