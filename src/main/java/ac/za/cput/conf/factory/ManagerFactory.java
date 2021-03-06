package ac.za.cput.conf.factory;
import ac.za.cput.domain.Manager;

import java.util.Map;
/**
 * Created by User on 2015/05/01.
 */
public class ManagerFactory {

    public static Manager createManager(
            Map<String,String>values, int numOfEmployees, long
            id) {
        Manager manager = new Manager
                .Builder()
                .phoneNumber(values.get("phoneNumber"))
                .name(values.get("name"))
                .numberOfEmployees(numOfEmployees)
                .jobTitle(values.get("jobTitle"))
                .department(values.get("department"))
                .id(id)
                .build();

        return manager;

    }
}
