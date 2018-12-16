package ch.team3.persistence;

import java.util.List;

public interface CustomerDAOIf {

    public void saveCustomer(String salutation, String firstname, String lastname);

    public List<String> getCustomers();

    /*public String getFirstName();
    public String getLastName();


    public void setFirstName(String firstName);
    public void setLastName(String lastName); */

}