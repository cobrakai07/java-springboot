package com.cobra.SpringLearning.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class JobController {

    private JobServiceImplement jobService;
    //how this jobService gets initialized?
    //with springBoot @Service annotation( use it in JobServiceImplement)
    //and make constructor of this class and from that initialize this.

    public JobController(JobServiceImplement jobService) {
        this.jobService = jobService;
    }



    @GetMapping("/get-jobs")
//    @RequestMapping(value = "/jobs",method = RequestMethod.GET)
    public ResponseEntity<List<Job>>  findAll(){
        return new ResponseEntity<>(jobService.findAll(),HttpStatus.OK);
    }

    @PostMapping("/add-job")
    public ResponseEntity<String> createJob(@RequestBody Job job){
        jobService.createJob(job);
        return new ResponseEntity<>("Job Added Successfully",HttpStatus.CREATED);
    }

    @GetMapping("/get-job/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){
        Job j=jobService.getJobById(id);
        if(j!=null) return new ResponseEntity<>(j, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("update-job/{id}")
    public ResponseEntity<Boolean> updateJobById(@PathVariable Long id, @RequestBody Job job){
       if(jobService.updateJob(id,job))return new ResponseEntity<>(true,HttpStatus.OK);
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete-job/{id}")
    public ResponseEntity<Boolean> deleteJobById(@PathVariable Long id){
        if(jobService.deleteJobById(id))
            return new ResponseEntity<>(true, HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
