package ch.team3.persistence;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOFactory implements CustomerDAOIf {

    private static CustomerDAOFactory setInstance = new CustomerDAOFactory();

    public static CustomerDAOFactory getInstance() {
        return setInstance;
    }

    public List<String> list;

    private CustomerDAOFactory() {
        this.list = new ArrayList<String>();
    }

    public void saveCustomer(String salutation, String firstname, String lastname) {
        list.add(salutation + " " + firstname + " " + lastname);

    }

    public List<String> getCustomers() {
        return this.list;
    }

    /*private String firstname = "Nicht definiert";
    private String lastname = "Nicht definiert";

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastname;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastname = lastName;

    }

    public void lokaleMethode() {

    } */
}