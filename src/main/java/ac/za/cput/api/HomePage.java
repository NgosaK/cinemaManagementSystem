package ac.za.cput.api;


import ac.za.cput.domain.Beverage;
import ac.za.cput.services.BeverageService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by OWNER on 2015/04/24.
 */

@RestController
@RequestMapping("/api/**")
public class HomePage {

    @Autowired
    private BeverageService service;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/beverage", method = RequestMethod.GET)
    public Beverage getMuseum(){
        Beverage beverage = new Beverage.Builder().category("Soda").volume(330).code(2342).name("Cream soda").price(30.00)
                .build();

        return beverage;
    }

    @RequestMapping(value = "/museums", method = RequestMethod.GET)
    public List<Beverage> getBeverages(){
        return service.getBeverages();
    }



}
