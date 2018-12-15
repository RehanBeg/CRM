package com.crm.presentation;

import com.crm.business.Address;
import com.crm.business.CustomerFactory;
import com.crm.business.ICustomer;

public class ConsoleClient {
    public static void main(String[] args){
        addCustomer("Herr","Rehan", "Mirza");
        showCustomer("Herr", "Michael", "Müller");
        //showAddresses();

        //showCustomers();
    }

//    public void displayCustomer() {
//        System.out.println("Customer: firstname=" + customer.getFirstName() + " lastname=" + customer.getLastName());
//        konkret.lokaleMethode();
//    }

    private static void addCustomer(String salutation, String firstName, String lastName) {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomer customer1 = factory.createCustomer(salutation, firstName, lastName);

        System.out.println(String.format("Kunde %s erstellt", customer1.getDisplayName()));
    }

    private static void showCustomer(String salutation, String firstName, String lastName) {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomer customer2 = factory.showCustomer(salutation, firstName, lastName);

        System.out.println(customer2.getDisplayName());
    }

    private void showAddresses(Address address) {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomer customerAddress = factory.showAddresses(address);

        System.out.println(customerAddress.getAddress());
    }
}