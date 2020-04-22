package com.alancamargo.cvbackend.model;

@SuppressWarnings("unused")
public class Company {

    private long id;
    private String name;
    private String location;
    private String industry;

    public Company() { }

    public Company(
            long id,
            String name,
            String location,
            String industry
    ) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.industry = industry;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getIndustry() {
        return industry;
    }

}
