package ch.team3.business;

public interface ICustomer {
    int getId();

    String getSalutation();

    void setSalutation(String salutation);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getDisplayName();

}