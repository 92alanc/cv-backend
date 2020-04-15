package com.alancamargo.cvbackend.model;

public class Address {

    private final String line1;
    private final String line2;
    private final String city;
    private final String county;
    private final String postcode;
    private final String country;

    public Address(
            String line1,
            String line2,
            String city,
            String county,
            String postcode,
            String country
    ) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
        this.country = country;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

}
