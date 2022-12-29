package com.labour.labourDetails.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.labour.labourDetails.Repositry.LabourRepo;
import com.labour.labourDetails.exceptions.PersonNotFoundException;
import com.labour.labourDetails.model.Labour;

import jakarta.validation.Valid;

@Service
@Transactional
public class LabourService {

	 @Autowired
	 private LabourRepo labourRepo;

	public void addLabour(@Valid Labour labour) {
		 
		labourRepo.save(labour);
	}

	public Boolean getbyName(String labourName) throws PersonNotFoundException{
		boolean nameList =labourRepo.existsByLabourName(labourName);
		return nameList;
	}

	public Boolean getNameByWork(String workCategory) {
		boolean nameList =labourRepo.existsByworkCategory(workCategory);
		return nameList;
	}

	public Labour updateLabourDetails(Labour lap) {
		Labour lab=new Labour();
		
		 Optional<Labour>updateemp=labourRepo.findById(lap.getlId());
		 if(updateemp.isPresent()) {
			 lab.setlId(lap.getlId());
			 lab.setLabourName(lap.getLabourName());
			 lab.setMobileNo(lap.getMobileNo());
			 lab.setWorkCategory(lap.getWorkCategory());
			 lab.setWorkExperience(lap.getWorkExperience());
			 lab.setLocation(lap.getLocation());
			 lab.setEmai(lap.getEmai());
			 lab.setPanNumber(lap.getPanNumber());
		 }else {
			 return new Labour();
		 }
		return labourRepo.save(lab);
	}

	public Labour getById(int labourId) {
		return labourRepo.findById(labourId).get();
	}

}
