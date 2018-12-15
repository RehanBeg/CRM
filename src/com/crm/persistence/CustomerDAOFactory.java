package com.crm.persistence;

public class CustomerDAOFactory implements CustomerDAOIf {

    private String firstname = "Nicht definiert";
    private String lastname = "Nicht definiert";

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastname;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastname = lastName;

    }

    public void lokaleMethode() {

    }
}
