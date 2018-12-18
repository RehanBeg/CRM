/**
 * UnitTesting CustomerDAOTest class to add, save and output the customer(s)
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.test.persistence;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import ch.team3.persistence.CustomerDAO;

public class CustomerDAOTest {

	/**
	 * Declare Variables
	 */
	private final int CUSTOMER_ID = 0;
	private final String CUSTOMER_SALUTATION = "herr";
    private final String CUSTOMER_FIRSTNAME_1 = "meister";
    private final String CUSTOMER_LASTNAME_1 = "proper";
    private final List<String> list = new ArrayList<>();
    private CustomerDAO customerDAO;

    /**
     * Initializes the customerDAO and adds and saves the customer in a list
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        customerDAO = new CustomerDAO();
        customerDAO.addCustomer(CUSTOMER_ID, CUSTOMER_SALUTATION, CUSTOMER_FIRSTNAME_1, CUSTOMER_LASTNAME_1);
        list.add(CUSTOMER_ID + " " + CUSTOMER_SALUTATION + " " + CUSTOMER_FIRSTNAME_1 + " " + CUSTOMER_LASTNAME_1);
    }

    /**
     * Checks if the added and saved customer in DAO is same as the hard created and added customer in list
     */
    @Test
    public void getCustomer() {
        assertThat(customerDAO.getCustomers(), is(this.list));
    }
}
