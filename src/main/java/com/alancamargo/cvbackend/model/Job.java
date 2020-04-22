package com.alancamargo.cvbackend.model;

import java.util.List;

public class Job {

    private long id;
    private String role;
    private Company company;
    private Period period;
    private String description;
    private List<Technology> technologies;

    public Job() { }

    public Job(
            long id,
            String role,
            Company company,
            Period period,
            String description,
            List<Technology> technologies
    ) {
        this.id = id;
        this.role = role;
        this.company = company;
        this.period = period;
        this.description = description;
        this.technologies = technologies;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public Company getCompany() {
        return company;
    }

    public Period getPeriod() {
        return period;
    }

    public String getDescription() {
        return description;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

}
