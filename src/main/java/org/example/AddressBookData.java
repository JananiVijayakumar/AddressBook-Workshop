package org.example;

public class AddressBookData {
    private String firstName, lastName, address, city, state, eMail;
    private int zipCode;
    private long mobileNumber;

    public AddressBookData(String firstName, String lastName, String address, String city, String state, String eMail, int zipCode, long mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.eMail = eMail;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AddressBookData() {
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return "AddressBook{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", city='" + city + '\'' + ",state='" + state + '\'' +  ",eMail='" + eMail + '\'' + ", zipCode=" + zipCode + ",mobileNumber='" + mobileNumber + '}';
    }
}
