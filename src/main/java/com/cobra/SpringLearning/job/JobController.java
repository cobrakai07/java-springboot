package com.cobra.SpringLearning.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Job>>  findAll(){
        return new ResponseEntity<>(jobService.findAll(),HttpStatus.OK);
    }

    @PostMapping("/jobs")
    public ResponseEntity<String> createJob(@RequestBody Job job){
        jobService.createJob(job);
        return new ResponseEntity<>("Job Added Successfully",HttpStatus.CREATED);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){
        Job j=jobService.getJobById(id);
        if(j!=null) return new ResponseEntity<>(j, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
