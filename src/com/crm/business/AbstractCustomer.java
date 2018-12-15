package com.crm.business;

public abstract class AbstractCustomer extends Customer {

    private int Id;
    private String salutation;
    private String surname;
    private String prename;

    public AbstractCustomer() {
    }

    public AbstractCustomer(int id, String salutation, String surname, String prename) {
        Id = id;
        this.salutation = salutation;
        this.surname = surname;
        this.prename = prename;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }
}
