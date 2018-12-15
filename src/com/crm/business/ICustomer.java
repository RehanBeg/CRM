package com.crm.business;

public interface ICustomer {
    public int getId();

    public void setId(int id);

    public String getPrename();

    public void setPrename(String prename);

    public String getSalutation();

    public void setSalutation(String salutation);

    public String getDisplayName();

    public Address getAddress();

    public void setAddress(Address address);
}