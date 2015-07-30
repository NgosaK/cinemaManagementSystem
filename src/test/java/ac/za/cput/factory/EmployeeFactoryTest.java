package ac.za.cput.factory;

import ac.za.cput.conf.factory.EmployeeFactory;
import ac.za.cput.domain.Employee;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2015/05/08.
 */
public class EmployeeFactoryTest extends  TestCase{

    @Test
    public void testCreateEmployee() throws  Exception{

        Map<String,String> values= new HashMap<String,String>();


        values.put("jobTitle","cashier");
        values.put("phoneNumber","09448754");

        Employee employee= EmployeeFactory.createEmployee(values, 556, "Tim");

        Assert.assertEquals("cashier",employee.getJobTitle());
    }

    @Test
    public void testUpdateEmployee()  throws Exception
    {
        Map<String,String> values= new HashMap<String,String>();

        values.put("jobTitle","cashier");
        values.put("phoneNumber","09448754");

        Employee employee= EmployeeFactory.createEmployee(values,556,"Tim");

        Employee newEmployee= new Employee
                .Builder()
                .copy(employee)
                .build();

        Assert.assertEquals("Tim",newEmployee.getName());
        Assert.assertEquals("09448754",newEmployee.getPhoneNumber());
        Assert.assertEquals(556,newEmployee.getId());
        Assert.assertEquals("cashier",newEmployee.getJobTitle());
    }

}
