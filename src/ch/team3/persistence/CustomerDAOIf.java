package ch.team3.persistence;

import java.util.List;
import ch.team3.business.ICustomer;

public interface CustomerDAOIf {

    void addCustomer(ICustomer customer);

    List<ICustomer> getCustomers();

    ICustomer getCustomerById(int id);

}