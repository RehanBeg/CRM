package com.crm.business;

public class CustomerFactory {

    private static CustomerFactory setInstance = new CustomerFactory();

    public static CustomerFactory getInstance() {
        return setInstance;
    }

    private CustomerFactory() {

    }

    public ICustomer createCustomer(String salutation, String firstname, String lastname){
        Customer customer = new Customer(0, salutation, firstname, lastname);
        return customer;
    }

    public ICustomer showCustomer(String salutation, String firstname, String lastname) {
        Customer customer = new Customer(0, salutation, firstname, lastname);
        return customer;
    }
}
