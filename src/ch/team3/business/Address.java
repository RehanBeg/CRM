package ch.team3.business;

import java.util.List;

public class Address {

    private String locationName;
    private String streetName;
    private String houseNumber;
    private String poBox;
    private String zipCode;
    private String city;
    private String country;
    private boolean mainAddress;
    private List<String> TelephoneNumbers;

    public Address() {

    }

    public Address(String locationName, String streetName, String houseNumber, String poBox, String zipCode, String city, String country, boolean mainAddress) {
        this.locationName = locationName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.poBox = poBox;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.mainAddress = mainAddress;
    }

    public List<String> getTelephoneNumbers() {
        return TelephoneNumbers;
    }

    public void setTelephoneNumbers() {
        TelephoneNumbers.add("044 590 00 12");
        TelephoneNumbers.add("044 590 00 22");
        TelephoneNumbers.add("044 590 00 44");

    }

    public String getLocationName() {
        return locationName;
    }


    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(boolean mainAddress) {
        this.mainAddress = mainAddress;
    }
}
