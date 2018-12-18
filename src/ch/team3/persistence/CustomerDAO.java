/**
 * Concrete CustomerDAO class which adds the customers to a list
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.persistence;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    /**
     * Customer ArrayList
     */
    public List<String> list;

    /**
     * Constructor
     */
    public CustomerDAO() {
        this.list = new ArrayList<>();
    }

    /**
     * Set instance for CustomerDAO
     */
    private static CustomerDAO setInstance = new CustomerDAO();

    /**
     * Instance for CustomerDAO
     * @return
     */
    public static CustomerDAO getInstance() {
        return setInstance;
    }

    /**
     * Adds a customer to the customer list
     * @param id
     * @param salutation
     * @param firstname
     * @param lastname
     */
    public void addCustomer(int id, String salutation, String firstname, String lastname) {
        list.add(id + " " + salutation + " " + firstname + " " + lastname);
    }

    /**
     * Getter to return the customer list
     * @return
     */
    public List<String> getCustomers() {
        for (int i = 0; i < this.list.size(); i++) {
                return list;
        }
        return null;
    }

}
