package com.example.registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.registration.Model.AckNumber;
import com.example.registration.Model.User;
import com.example.registration.Model.UserRepo;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private AckNumber ack;
	
	@GetMapping("/register-user/{userName}/{password}")
	public String registered(@PathVariable("userName") String userName,@PathVariable("password") String password)
	{
		User u = new User();
		
		u.setId(1);
		u.setName(userName);
		u.setPassword(password);
		u.setAckname(ack.showRandom());
		urepo.save(u);
		System.out.println("User detail:"+u);
		return"welcome";
	}
	

}
