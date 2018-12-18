/**
 * Interface for the CustomerDAOFactory class
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.persistence;

import java.util.List;

public interface ICustomerDAO {

    /**
     * Add a customer
     * @param id
     * @param salutation
     * @param firstname
     * @param lastname
     */
    void addCustomer(int id, String salutation, String firstname, String lastname);

    /**
     * Get all customers
     * @return
     */
    List<String> getCustomers();

}