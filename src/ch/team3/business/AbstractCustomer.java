package ch.team3.business;

public abstract class AbstractCustomer implements ICustomer {

    private final int id;
    private String salutation;
    private String firstname;
    private String lastname;

    public AbstractCustomer(int id, String salutation, String firstname, String lastname) {
        this.id = id;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
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

    abstract public String getDisplayName();
}
