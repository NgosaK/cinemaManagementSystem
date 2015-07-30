package ac.za.cput.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by ADRIAN on 17/4/2015.
 */
@Entity
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNum;

    private Customer(){}

    public long getId() {return id;}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }


    public Customer(Builder builder)
    {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        address = builder.address;
        phoneNum = builder.phoneNum;
    }


    public static class Builder
    {
        private long id;
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phoneNum;


        public Builder(String fn){this.firstName = fn;}

        public Builder id(long fn){this.id = fn; return this;}
        public Builder lastName(String fn){this.lastName = fn; return this;}
        public Builder age(int fn){this.age = fn; return this;}
        public Builder address(String fn){this.address = fn; return this;}
        public Builder phoneNum(String fn){this.phoneNum = fn; return this;}

        public Customer build() {return new Customer(this);}


    }

}
