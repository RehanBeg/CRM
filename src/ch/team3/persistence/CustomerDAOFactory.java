package ch.team3.persistence;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOFactory implements CustomerDAOIf {

    private static CustomerDAOFactory setInstance = new CustomerDAOFactory();

    public static CustomerDAOFactory getInstance() {
        return setInstance;
    }

    private CustomerDAOFactory() {

    }

    public void addCustomer(int id, String salutation, String firstname, String lastname) {
        CustomerDAO customerDao = CustomerDAO.getInstance();
        customerDao.addCustomer(id, salutation, firstname, lastname);
    }

    public List<String> getCustomers(){
        CustomerDAO customerDao = CustomerDAO.getInstance();
        return customerDao.getCustomers();
    }

}