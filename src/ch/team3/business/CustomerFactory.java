package ch.team3.business;

import ch.team3.persistence.CustomerDAOFactory;
import ch.team3.persistence.CustomerDAOIf;

public class CustomerFactory {

    public static ICustomer createCustomer(int id, String salutation, String firstname, String lastname){
        Customer customer = new Customer(id, salutation, firstname, lastname);
        return customer;
    }
}
