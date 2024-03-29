package com.alancamargo.cvbackend.model;

import java.util.List;

@SuppressWarnings("unused")
public class ContactInfo {

    private String fullName;
    private String phone;
    private String email;
    private List<String> links;

    public ContactInfo() { }

    public ContactInfo(
            String fullName,
            String phone,
            String email,
            List<String> links
    ) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.links = links;
    }

    public String getFullName() {
        return fullName;
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
