package com.crm.business;

public class Customer implements ICustomer {

    private int Id;
    private String salutation;
    private String surname;
    private String prename;
    private CustomerContact[] contacts;
    private Address address;

    public Customer() {

    }

    public Customer(int id, String salutation, String surname, String prename) {
        Id = id;
        this.salutation = salutation;
        this.surname = surname;
        this.prename = prename;
    }

    public Customer(Address address) {
        this.address = address;
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

    public String getDisplayName(){
        return this.getSalutation() + " " + this.getPrename() + " " + this.getSurname();
    }

    public Address getAddress() { return address; }

    public void setAddress(Address address) {this.address = address;}
}