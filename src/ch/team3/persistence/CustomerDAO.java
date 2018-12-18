package ch.team3.persistence;

import ch.team3.business.ICustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements CustomerDAOIf {

    public List<ICustomer> list;

    public CustomerDAO() {
        this.list = new ArrayList<>();
    }

    private static CustomerDAO setInstance = new CustomerDAO();

    public static CustomerDAO getInstance() {
        return setInstance;
    }

    public void addCustomer(ICustomer customer) {
        list.add(customer);
    }

    public List<ICustomer> getCustomers() {
        return this.list;
    }

    public ICustomer getCustomerById(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            if (list.get(i).getId() == id)
                return list.get(i);
        }
        return null;
    }
}
