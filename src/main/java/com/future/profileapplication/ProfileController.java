package com.future.profileapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.future.profileapplication.model.Profile;

@RestController
@RequestMapping(value = "/customer")
public class ProfileController {

	@GetMapping(value = "/v1/profile")
	public Profile getProfile() {
		
		Profile pf= new Profile();
		pf.setAge(20);
		pf.setFirstName("Swapnil");		
		pf.setLastName("Joshi");
	 return pf;	 
	 
	}

}
