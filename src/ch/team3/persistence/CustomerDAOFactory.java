/**
 * Factory class which inherits the AbstractCustomer
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.persistence;

import java.util.List;

public class CustomerDAOFactory implements ICustomerDAO {

    /**
     * Set instance for CustomerDAOFactory
     */
    private static CustomerDAOFactory setInstance = new CustomerDAOFactory();

    /**
     * Instance for CustomerDAOFactory
     * @return
     */
    public static CustomerDAOFactory getInstance() {
        return setInstance;
    }

    /**
     * Constructor
     */
    private CustomerDAOFactory() {

    }

    /**
     * Add a customer
     * @param id
     * @param salutation
     * @param firstname
     * @param lastname
     */
    public void addCustomer(int id, String salutation, String firstname, String lastname) {
        CustomerDAO customerDao = CustomerDAO.getInstance();
        customerDao.addCustomer(id, salutation, firstname, lastname);
    }

    /**
     * Get all customers
     * @return
     */
    public List<String> getCustomers(){
        CustomerDAO customerDao = CustomerDAO.getInstance();
        return customerDao.getCustomers();
    }

}