package com.cobra.SpringLearning.job;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private JobServiceImplement jobService;
    //how this jobService gets initialized?
    //with springBoot @Service annotation( use it in JobServiceImplement)
    //and make constructor of this class and from that initialize this.

    public JobController(JobServiceImplement jobService) {
        this.jobService = jobService;
    }



    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        jobService.createJob(job);
        return "Job Added Successfully";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id){
        return jobService.getJobById(id);
    }
}
