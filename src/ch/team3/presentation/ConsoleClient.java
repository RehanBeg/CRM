package ch.team3.presentation;

import ch.team3.business.ICustomer;
import ch.team3.business.CustomerFactory;
import ch.team3.persistence.CustomerDAOIf;

public class ConsoleClient {
    public static void main(String[] args){
        addCustomer("Herr","Rehan", "Mirza");
        addCustomer("Herr","Dominic", "Wüthrich");
        //showCustomer("Herr", "Michael", "Müller");
    }

    private static void addCustomer(String salutation, String firstName, String lastName) {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomer customer = factory.createCustomer(salutation, firstName, lastName);
        System.out.println(String.format("%nKunde %s erstellt%n", customer.getDisplayName()));

        CustomerDAOIf customerDao = factory.saveCustomer(salutation, firstName, lastName);
        System.out.println(String.format("Abgespeicherte Kunden: %n%s", customerDao.getCustomers()));
        System.out.println(String.format("---------------------------------"));

        //System.out.println(String.format("Kunde %s gespeichert", customer1.getDisplayName()));
    }

    private static void showCustomer(String salutation, String firstName, String lastName) {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomer customer2 = factory.showCustomer(salutation, firstName, lastName);

        System.out.println(customer2.getDisplayName());
    }

//    public void displayCustomer() {
//        System.out.println("Customer: firstname=" + customer.getFirstName() + " lastname=" + customer.getLastName());
//        konkret.lokaleMethode();
//    }

}