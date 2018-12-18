/**
 * ConsoleClass as Main class to initiate the software
 *
 * @author Rehan Beg Mirza
 * @author Dominic Wüthrich
 */

package ch.team3.presentation;

import ch.team3.business.ICustomer;
import ch.team3.business.CustomerFactory;
import ch.team3.persistence.ICustomerDAO;

public class ConsoleClient {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args){
        System.out.println(String.format("team3_aufgabe3 - Rehan Mirza & Dominic Wüthrich"));
        System.out.println(String.format("%n"));
        addCustomer(0, "Herr","Rudolf", "Leuenberg");
        addCustomer(1,"Frau","Tina", "Trump");
        addCustomer(2, "Frau","Christine", "Müller");
        addCustomer(3, "Herr","James", "Bond");
        showCustomer();
    }

    /**
     * Adds a customer and saves it in the CustomerDAO
     * @param id
     * @param salutation
     * @param firstName
     * @param lastName
     */
    private static void addCustomer(int id, String salutation, String firstName, String lastName) {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomer customer = factory.createCustomer(salutation, firstName, lastName);
        System.out.println(String.format("Kunde %s erstellt", customer.getDisplayName()));
        factory.addCustomer(id, salutation, firstName, lastName);
    }

    /**
     * Outputs all customers
     */
    private static void showCustomer() {
        CustomerFactory factory = CustomerFactory.getInstance();
        ICustomerDAO customerDao = factory.showCustomer();
        System.out.println(String.format(""));
        System.out.println(String.format("---------------------------------"));
        System.out.println("Abgespeicherte Kunden:");
        for(int i = 0; i < customerDao.getCustomers().size(); i++) {
            System.out.println(String.format("%s", customerDao.getCustomers().get(i)));
        }
        System.out.println(String.format("---------------------------------"));
    }

}