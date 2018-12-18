package ch.team3.persistence;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    public List<String> list;

    public CustomerDAO() {
        this.list = new ArrayList<>();
    }

    private static CustomerDAO setInstance = new CustomerDAO();

    public static CustomerDAO getInstance() {
        return setInstance;
    }

    public void addCustomer(int id, String salutation, String firstname, String lastname) {
        list.add(id + " " + salutation + " " + firstname + " " + lastname);
    }

    public List<String> getCustomers() {
        return this.list;
    }
}
