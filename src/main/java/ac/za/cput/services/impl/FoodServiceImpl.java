package ac.za.cput.services.impl;

import ac.za.cput.domain.Food;
import ac.za.cput.repository.FoodRepository;
import ac.za.cput.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OWNER on 2015/04/24.
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodRepository repository;

    public List<Food> getFood(){
        List<Food> allFood = new ArrayList<Food>();

        Iterable<Food> foods = repository.findAll();

        for(Food food: foods)
        {
            allFood.add(food);
        }
        return allFood;
    }


}
