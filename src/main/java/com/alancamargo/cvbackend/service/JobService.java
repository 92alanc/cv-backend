package com.alancamargo.cvbackend.service;

import com.alancamargo.cvbackend.model.Job;

import java.util.List;

public interface JobService {

    Job getCurrentJob();

    List<Job> getPreviousJobs();

}
