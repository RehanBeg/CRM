/**
 * UnitTesting CustomerTest class to output the customer
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.test.business;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ch.team3.business.Customer;

public class CustomerTest {

	/**
	 * Declare Variables
	 */
	private final int CUSTOMER_ID = 0;
	private final String CUSTOMER_SALUTATION = "herr";
    private final String CUSTOMER_FIRSTNAME_1 = "meister";
    private final String CUSTOMER_LASTNAME_1 = "proper";
    private Customer customer;

    /**
     * Initializes the customer
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        customer = new Customer(CUSTOMER_ID, CUSTOMER_SALUTATION, CUSTOMER_FIRSTNAME_1, CUSTOMER_LASTNAME_1);
    }

    /**
     * Checks if the added customer is same as the hard created and added customer
     */
    @Test
    public void getDisplayName() {
        assertThat(customer.getDisplayName(), is(this.CUSTOMER_SALUTATION + " " + this.CUSTOMER_FIRSTNAME_1 + " " + this.CUSTOMER_LASTNAME_1));
    }
}