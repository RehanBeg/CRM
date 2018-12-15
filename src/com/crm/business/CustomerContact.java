package com.crm.business;

import java.util.List;

public class CustomerContact {

    private List<String> telephoneNumbers;
    private List<String> mobileNumber;
    private String faxNumber;
    private List<String> emailAddress;
    private Address[] addresses;

    public List<String> getTelephoneNumbers(){
        return this.telephoneNumbers;
    }

    public void setTelephoneNumbers(List<String> telephoneNumbers){
        this.telephoneNumbers = telephoneNumbers;
    }

    public List<String> getMobileNumber(){
        return mobileNumber;
    }

    public void setMobileNumber(List<String> mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public String getFaxNumber(){
        return faxNumber;
    }

    public void setFaxNumber(String faxnumber){
        this.faxNumber = faxnumber;
    }

    public List<String> getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(List<String> emailAddress){
        this.emailAddress = emailAddress;
    }

    public Address[] getAddresses(){
        return this.addresses;
    }

    public void setAddresses(Address[] addresses){
        this.addresses = addresses;
    }


/*    public List<Address> getAddresses();

    public void setAddress();*/
}