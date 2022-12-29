package com.user.demo.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.demo.dto.ResponceDto;
import com.user.demo.dto.Userdto;
import com.user.demo.exception.UserNotFoundException;
import com.user.demo.model.User;
import com.user.demo.userservice.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<Userdto> addUser(@RequestBody  @Valid Userdto user){
		userService.createUser(user);
		return new ResponseEntity<Userdto>(HttpStatus.CREATED);
	}
	
	@GetMapping("/exists/{UserName}")
	public ResponseEntity<User> getLabourByName(@PathVariable String UserName) throws UserNotFoundException{
		User list=userService.getbyName(UserName);
		if(list!=null) {
			throw new UserNotFoundException();
		}
		return new ResponseEntity<User>(list,HttpStatus.ACCEPTED);
	}
	
//	public String connect() {
//		RestTemplate template=new RestTemplate();
//		String connect1=template.getForObject("http://localhost:8089/api/v1/", String.class);
//		return connect1;
//	}
	
	 @GetMapping("{userId}")
	    public ResponseEntity<ResponceDto> getUser(@PathVariable("userId") int userId){
		 ResponceDto responseDto = userService.getUserById(userId);
	        return ResponseEntity.ok(responseDto);
	    }
	
	
}
