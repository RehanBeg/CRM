package ch.team3.persistence;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private int id;
    private String salutation = "Nicht definiert";;
    private String firstname = "Nicht definiert";
    private String lastname = "Nicht definiert";
    public List<String> list;


    public CustomerDAO() {

    }

    private static CustomerDAO setInstance = new CustomerDAO();

    public static CustomerDAO getInstance() {
        return setInstance;
    }

    public CustomerDAO(int iD, String salutation, String firstname, String lastname) {
        id = iD;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setCustomer(int id, String salutation, String firstname, String lastname) {
        list.add(id + " " + salutation + " " + firstname + " " + lastname);
    }

    public List<String> getCustomers() {
        return this.list;
    }
}
