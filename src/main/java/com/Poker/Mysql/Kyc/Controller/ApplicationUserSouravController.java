package com.Poker.Mysql.Kyc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Poker.Mysql.Kyc.Service.ApplicationUserSouravService;
import com.Poker.Mysql.Kyc.entity.ApplicationUserSourav;

@RestController
@RequestMapping("/sourav")
public class ApplicationUserSouravController {
	@Autowired
	private ApplicationUserSouravService applicationUserSouravService;

	@PostMapping("/imapping")
	public ApplicationUserSourav saveAllUser(@RequestBody ApplicationUserSourav applicationUserSourav) {
		return applicationUserSouravService.saveAllUser(applicationUserSourav);

	}

	@GetMapping("/gmappin/{user_id}")
	public ApplicationUserSourav geteUserById(@PathVariable int user_id) {
		return applicationUserSouravService.getUserById(user_id);

	}

	@GetMapping("/getmappinga")
	public List<ApplicationUserSourav> getByAll() {
		return applicationUserSouravService.getByAll();

	}

	@DeleteMapping("/deletmapping/{user_id}")
	public void deleteById(@PathVariable int user_id) {
		applicationUserSouravService.deleteUserById(user_id);
	}

}
