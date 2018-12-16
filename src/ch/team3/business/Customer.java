package ch.team3.business;

public class Customer implements ICustomer {

    private int Id;
    private String salutation;
    private String firstname;
    private String lastname;

    public Customer() {

    }

    public Customer(int id, String salutation, String firstname, String lastname) {
        Id = id;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getDisplayName(){
        return this.getSalutation() + " " + this.getFirstName() + " " + this.getLastName();
    }

}