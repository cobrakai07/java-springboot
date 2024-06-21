package com.cobra.SpringLearning.job;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository <Job, Long>{
    //we can also extend CrudRepository as well, but this JPA repository extends functionality of CrudRepository by providing functions like flush.

}
