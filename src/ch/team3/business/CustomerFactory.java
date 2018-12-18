/**
 * Factory Class to create, save and show customer
 * and provides the customer from DAO
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.business;

import ch.team3.persistence.CustomerDAOFactory;
import ch.team3.persistence.ICustomerDAO;

public class CustomerFactory {

    /**
     * Set instance for CustomerFactory
     */
    private static CustomerFactory setInstance = new CustomerFactory();

    /**
     * Instance for CustomerDAOFactory
     * @return
     */
    public static CustomerFactory getInstance() {
        return setInstance;
    }

    /**
     * Constructor
     */
    private CustomerFactory() {

    }

    /**
     * Creates the customer and returns it
     * @param salutation
     * @param firstname
     * @param lastname
     * @return
     */
    public ICustomer createCustomer(String salutation, String firstname, String lastname){
        Customer customer = new Customer(0, salutation, firstname, lastname);
        return customer;
    }

    /**
     * Adds a customer to save in DAO
     * @param id
     * @param salutation
     * @param firstname
     * @param lastname
     * @return
     */
    public ICustomerDAO addCustomer(int id, String salutation, String firstname, String lastname) {
        CustomerDAOFactory daoFactory = CustomerDAOFactory.getInstance();
        daoFactory.addCustomer(id, salutation, firstname, lastname);
        return daoFactory;
    }

    /**
     * Outputs the customer(s)
     * @return
     */
    public ICustomerDAO showCustomer() {
        CustomerDAOFactory daoFactory = CustomerDAOFactory.getInstance();
        return daoFactory;
    }
}
