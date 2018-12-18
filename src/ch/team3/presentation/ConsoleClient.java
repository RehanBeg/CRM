package ch.team3.presentation;

import ch.team3.business.ICustomer;
import ch.team3.business.CustomerFactory;
import ch.team3.persistence.CustomerDAOIf;

public class ConsoleClient {
    public static void main(String[] args){
        addCustomer(0, "Herr","Rehan", "Mirza");
        addCustomer(1,"Herr","Dominic", "Wüthrich");
        addCustomer(2, "Frau","Christine", "Müller");
        showCustomer();
    }

    private static void addCustomer(int id, String salutation, String firstName, String lastName) {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomer customer = factory.createCustomer(salutation, firstName, lastName);
        System.out.println(String.format("%nKunde %s erstellt%n", customer.getDisplayName()));
        factory.addCustomer(id, salutation, firstName, lastName);
    }

    private static void showCustomer() {
        CustomerFactory factory = CustomerFactory.getInstance();
        CustomerDAOIf customerDao = factory.showCustomer();
        System.out.println(String.format("Abgespeicherte Kunden: %n%s", customerDao.getCustomers()));
        System.out.println(String.format("---------------------------------"));
    }

}