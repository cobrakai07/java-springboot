package com.cobra.SpringLearning.job;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImplement implements JobService{

    private List<Job> jobs= new ArrayList<>();
    private Long nextId =1L;

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for(Job j:jobs){
            if(j.getId().equals(id))return j;
        }
        return new Job("No Job Found","NO Job", (long) -1, (long) 000L,(long)000,"Nowhere");
    }


}
