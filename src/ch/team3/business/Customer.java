/**
 * Concrete Customer class which inherits the AbstractCustomer
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.business;

public class Customer extends AbstractCustomer {

    /**
     * Constructor
     * @param id
     * @param salutation
     * @param firstname
     * @param lastname
     */
    public Customer(int id, String salutation, String firstname, String lastname) {
        super(id, salutation, firstname, lastname);
    }

    /**
     * Outputs the customer
     * @return
     */
    @Override
    public String getDisplayName(){
        return this.getSalutation() + " " + this.getFirstName() + " " + this.getLastName();
    }
}