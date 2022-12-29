package com.user.demo.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.demo.UserRepo.UserRepositry;
import com.user.demo.dto.LabourDto;
import com.user.demo.dto.ResponceDto;
import com.user.demo.dto.Userdto;
import com.user.demo.model.User;

import jakarta.validation.Valid;

@Service
public class UserService {

	@Autowired
	private UserRepositry userRepo;
	@Autowired
	 private RestTemplate restTemplate;

	public void createUser(@Valid Userdto user) {
		userRepo.save(user);
		
	}

	public User getbyName(String userName) {
		User nameList =userRepo.existsByuserName(userName);
		return nameList;
	}

	public ResponceDto getUserById(int userId) {
		ResponceDto responseDto = new ResponceDto();
		Userdto user = userRepo.findById(userId).get();
       Userdto userDto = mapToUser(user);

        ResponseEntity<LabourDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8089/api/v1/" + user.getLabourId(),LabourDto.class);

        LabourDto labourDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        responseDto.setUser(userDto);
        responseDto.setLabour(labourDto);

        return responseDto;
    
	}

	 private Userdto mapToUser(Userdto user){
	        Userdto userDto = new Userdto();
	        userDto.setUserId(user.getUserId());
	        userDto.setUserName(user.getUserName());
	        userDto.setAddress(user.getAddress());
	        userDto.setEmail(user.getEmail());
	        userDto.setAadharNo(user.getAadharNo());
	        userDto.setLabourId(user.getLabourId());
	        return userDto;
	    }
	
}
