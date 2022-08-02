package com.alancamargo.cvbackend.controller;

import com.alancamargo.cvbackend.model.Job;
import com.alancamargo.cvbackend.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("unused")
@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs/current")
    public Job getCurrentJob() {
        return jobService.getCurrentJob();
    }

    @GetMapping("/jobs/previous")
    public List<Job> getPreviousJobs() {
        return jobService.getPreviousJobs();
    }

}
