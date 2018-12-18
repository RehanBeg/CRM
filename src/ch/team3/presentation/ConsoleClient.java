package ch.team3.presentation;

import ch.team3.business.ICustomer;
import ch.team3.business.CustomerFactory;
import ch.team3.persistence.CustomerDAOFactory;
import ch.team3.persistence.CustomerDAOIf;

public class ConsoleClient {
    public static void main(String[] args){
        addCustomer(0, "Herr","Rehan", "Mirza");
        addCustomer(1,"Herr","Dominic", "Wüthrich");
        addCustomer(2, "Frau","Christine", "Müller");
        showCustomer();
    }

    private static void addCustomer(int id, String salutation, String firstName, String lastName) {
        ICustomer customer = CustomerFactory.createCustomer(id, salutation, firstName, lastName);
        System.out.println(String.format("Kunde %s erstellt", customer.getDisplayName()));
        CustomerDAOIf customerDAO = CustomerDAOFactory.getDAO();
        customerDAO.addCustomer(customer);
    }

    private static void showCustomer() {
        CustomerDAOIf customerDAO = CustomerDAOFactory.getDAO();
        System.out.println(String.format(""));
        System.out.println(String.format("---------------------------------"));
        System.out.println(String.format("Abgespeicherte Kunden:"));
        for (ICustomer customer : customerDAO.getCustomers() ) {
            System.out.println(String.format("%d:\t%s", customer.getId(), customer.getDisplayName()));
        }
        System.out.println(String.format("---------------------------------"));
    }

}