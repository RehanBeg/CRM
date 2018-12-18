/**
 * Interface for the AbstractCustomer abstract class
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.business;

public interface ICustomer {

    /**
     * Getter and setter for id
     * @return
     */
    int getid();
    void setid(int id);

    /**
     * Getter and setter for salutation
     * @return
     */
    String getSalutation();
    void setSalutation(String salutation);

    /**
     * Getter and setter for firstname
     * @return
     */
    String getFirstName();
    void setFirstName(String firstName);

    /**
     * Getter and setter for lastname
     * @return
     */
    String getLastName();
    void setLastName(String lastName);

    /**
     * Getter to display the customer
     */
    String getDisplayName();

}