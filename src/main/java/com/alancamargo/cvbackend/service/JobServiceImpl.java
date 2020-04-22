package com.alancamargo.cvbackend.service;

import com.alancamargo.cvbackend.model.Company;
import com.alancamargo.cvbackend.model.Job;
import com.alancamargo.cvbackend.model.Period;
import com.alancamargo.cvbackend.model.Technology;

import java.util.ArrayList;
import java.util.List;

public class JobServiceImpl implements JobService {

    @Override
    public Job getCurrentJob() {
        Company company = new Company(1, "Jack Hammer", "St. Ives", "Construction");
        Period period = new Period(6, 2019, null, null);
        List<Technology> technologies = new ArrayList<>();
        technologies.add(new Technology(1, "Construction"));
        technologies.add(new Technology(2, "Bricklaying"));
        technologies.add(new Technology(3, "Plaster walls"));
        technologies.add(new Technology(4, "Cement mixing"));

        return new Job(
                1,
                "Bricklayer",
                company,
                period,
                "I lay bricks and build stuff",
                technologies
        );
    }

    @Override
    public List<Job> getPreviousJobs() {
        Company company = new Company(1, "Brick My Heart", "Huntingdon", "Construction");
        Period period = new Period(7, 2017, 6, 2019);
        List<Technology> technologies = new ArrayList<>();
        technologies.add(new Technology(1, "Construction"));
        technologies.add(new Technology(2, "Bricklaying"));
        technologies.add(new Technology(3, "Plaster walls"));
        technologies.add(new Technology(4, "Cement mixing"));

        Job job = new Job(
                2,
                "Bricklayer",
                company,
                period,
                "I used to lay bricks and build stuff",
                technologies
        );

        List<Job> previousJobs = new ArrayList<>();

        previousJobs.add(job);
        previousJobs.add(job);
        previousJobs.add(job);

        return previousJobs;
    }

}
