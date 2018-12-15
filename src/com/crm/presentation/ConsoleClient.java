package com.crm.presentation;

import com.crm.business.CustomerFactory;
import com.crm.business.CustomerInterface;

public class ConsoleClient {
    public static void main(String[] args){
        addCustomer("Herr","Rehan", "Mirza");
    }


//    public void displayCustomer() {
//        System.out.println("Customer: firstname=" + customer.getFirstName() + " lastname=" + customer.getLastName());
//        konkret.lokaleMethode();
//    }

    private static void addCustomer(String salutation, String firstName, String lastName) {
        CustomerFactory factory = CustomerFactory.getInstance();
        CustomerInterface customer1 = factory.createCustomer(salutation, firstName, lastName);

        System.out.println(String.format("Kunde %s erstellt", customer1.getDisplayName()));
    }
}