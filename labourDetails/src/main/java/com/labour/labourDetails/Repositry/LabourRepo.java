package com.labour.labourDetails.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.labour.labourDetails.model.Labour;
@Repository
@EnableJpaRepositories
public interface LabourRepo extends JpaRepository<Labour, Integer>{

	 

	//boolean existByLabourName(String labourName);

	boolean existsByLabourName(String labourName);

	boolean existsByworkCategory(String workCategory);

}
