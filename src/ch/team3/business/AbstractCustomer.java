/**
 * Implements the Getter and Setter from the Interface
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.business;

public abstract class AbstractCustomer implements ICustomer {

    /**
     * Declare the variables
     */
    private int id;
    private String salutation;
    private String firstname;
    private String lastname;

    /**
     * Constructor
     */
    public AbstractCustomer() {

    }

    /**
     * Constructor
     */
    public AbstractCustomer(int id, String salutation, String firstname, String lastname) {
        this.id = id;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Getter and Setter for id
     * @return
     */
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }

    /**
     * Getter and setter for salutation
     * @return
     */
    public String getSalutation() {
        return salutation;
    }
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /**
     * Getter and setter for firstname
     * @return
     */
    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Getter and setter for lastname
     * @return
     */
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Getter to output the customer
     * @return
     */
    abstract public String getDisplayName();
}
