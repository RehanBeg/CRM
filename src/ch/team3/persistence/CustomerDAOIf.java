package ch.team3.persistence;

import java.util.List;

public interface CustomerDAOIf {

    public void addCustomer(int id, String salutation, String firstname, String lastname);

    public List<String> getCustomers();


}