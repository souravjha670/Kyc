package com.Poker.Mysql.Kyc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Poker.Mysql.Kyc.Repository.ApplicationUserSouravRepository;
import com.Poker.Mysql.Kyc.entity.ApplicationUserSourav;

@Service

public class ApplicationUserSouravImpl implements ApplicationUserSouravService {
	@Autowired
	private ApplicationUserSouravRepository applicationUserSouravRepository;

	@Override
	public ApplicationUserSourav saveAllUser(ApplicationUserSourav applicationUserSourav) {

		return applicationUserSouravRepository.save(applicationUserSourav);
	}

	@Override
	public ApplicationUserSourav getUserById(int user_id) {

		return applicationUserSouravRepository.findById(user_id).orElse(null);
	}

	@Override
	public void deleteUserById(int user_id) {
		applicationUserSouravRepository.deleteById(user_id);

	}

	@Override
	public List<ApplicationUserSourav> getByAll() {

		return applicationUserSouravRepository.findAll();
	}

}
