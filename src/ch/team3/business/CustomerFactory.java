package ch.team3.business;

import ch.team3.persistence.CustomerDAOFactory;
import ch.team3.persistence.CustomerDAOIf;

public class CustomerFactory {

    private static CustomerFactory setInstance = new CustomerFactory();

    public static CustomerFactory getInstance() {
        return setInstance;
    }

    private CustomerFactory() {

    }

    public ICustomer createCustomer(String salutation, String firstname, String lastname){
        Customer customer = new Customer(0, salutation, firstname, lastname);
        return customer;
    }

    public ICustomer showCustomer(String salutation, String firstname, String lastname) {
        Customer customer = new Customer(0, salutation, firstname, lastname);
        return customer;
    }

    public CustomerDAOIf saveCustomer(String salutation, String firstname, String lastname) {
        CustomerDAOFactory daoFactory = CustomerDAOFactory.getInstance();
        daoFactory.saveCustomer(salutation, firstname, lastname);
        return daoFactory;
    }

}
