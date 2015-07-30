package ac.za.cput.api;


import ac.za.cput.domain.Beverage;
import ac.za.cput.model.BeverageResource;
import ac.za.cput.services.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADRIAN on 22/5/2015.
 */
@RestController
@RequestMapping(value="/museum/**")
public class BeveragePage {
    @Autowired
    private BeverageService service;
    @RequestMapping(value="/{id}", method= RequestMethod.GET)


    public List<BeverageResource> getBeverages()
    {
        List<BeverageResource> hateos = new ArrayList<>();
        List<Beverage> beverages =service.getBeverages();
        for(Beverage beverage : beverages)
        {
            BeverageResource res = new BeverageResource
                    .Builder()
                    .name(beverage.getName())
                    .code(beverage.getCode())
                    .price(beverage.getPrice())
                    .volume(beverage.getVolume())
                    .category(beverage.getCategory())
                    .build();
            Link employees = new
                    Link("http://localhost:8080/cinema/"+res.getCategory())
                    .withRel("emps");
            res.add(employees);
            hateos.add(res);

        }
        return hateos;
    }


}
