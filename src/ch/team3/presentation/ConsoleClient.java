package ch.team3.presentation;

import ch.team3.business.ICustomer;
import ch.team3.business.CustomerFactory;
import ch.team3.persistence.CustomerDAOIf;

public class ConsoleClient {
    public static void main(String[] args){
        addCustomer("Herr","Rehan", "Mirza");
        addCustomer("Herr","Dominic", "Wüthrich");
        addCustomer("Frau","Sandra", "Bullrock");
        showCustomer();
    }

    private static void addCustomer(String salutation, String firstName, String lastName) {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomer customer = factory.createCustomer(salutation, firstName, lastName);
        System.out.println(String.format("%nKunde %s erstellt%n", customer.getDisplayName()));
        CustomerDAOIf customerDao = factory.saveCustomer(salutation, firstName, lastName);
    }

    private static void showCustomer() {
        CustomerFactory factory = CustomerFactory.getInstance();
        CustomerDAOIf customerDao = factory.showCustomer();
        System.out.println(String.format("Abgespeicherte Kunden: %n%s", customerDao.getCustomers()));
        System.out.println(String.format("---------------------------------"));
    }

}