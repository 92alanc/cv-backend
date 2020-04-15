package com.alancamargo.cvbackend.model;

import java.util.List;

public class ContactInfo {

    private final String fullName;
    private final Address address;
    private final String phone;
    private final String email;
    private final List<String> links;

    public ContactInfo(
            String fullName,
            Address address,
            String phone,
            String email,
            List<String> links
    ) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.links = links;
    }

    public String getFullName() {
        return fullName;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getLinks() {
        return links;
    }

}
