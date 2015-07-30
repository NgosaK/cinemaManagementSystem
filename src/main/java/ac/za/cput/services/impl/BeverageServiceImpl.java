package ac.za.cput.services.impl;

import ac.za.cput.domain.Beverage;
import ac.za.cput.repository.BeverageRepository;
import ac.za.cput.services.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by OWNER on 2015/04/24.
 */
@Service
public class BeverageServiceImpl implements BeverageService {

    @Autowired
    private BeverageRepository repository;
    public List<Beverage> getBeverages(){
        List<Beverage> allDrinks = new ArrayList<Beverage>();

        Iterable<Beverage> beverages = repository.findAll();
        for (Beverage artist : beverages){
            allDrinks.add(artist);
        }
        return allDrinks;
    }
}
