package ch.team3.business;

public class Customer extends AbstractCustomer {

    public Customer(int id, String salutation, String firstname, String lastname) {
        super(id, salutation, firstname, lastname);
    }

    @Override
    public String getDisplayName(){
        return this.getSalutation() + " " + this.getFirstName() + " " + this.getLastName();
    }
}