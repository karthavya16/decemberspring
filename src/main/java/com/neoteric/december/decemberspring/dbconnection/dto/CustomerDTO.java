package com.neoteric.december.decemberspring.dbconnection.dto;

public class CustomerDTO {

    private String name;
    private String email;
    private String mobileNumber;
    private AddressDTO address;
    private NomineeDTO nominee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public NomineeDTO getNominee() {
        return nominee;
    }

    public void setNominee(NomineeDTO nominee) {
        this.nominee = nominee;
    }
}
