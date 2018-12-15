package com.crm.business;

public class CustomerFactory {
    private static CustomerFactory ourInstance = new CustomerFactory();

    public static CustomerFactory getInstance() {
        return ourInstance;
    }

    private CustomerFactory() {

    }

    public CustomerInterface createCustomer(String salutation, String firstname, String lastname){
        Customer customer = new Customer(0, salutation, firstname, lastname);
        return customer;
    }
}
