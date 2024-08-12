package com.Poker.Mysql.Kyc.Service;

import java.util.List;

import com.Poker.Mysql.Kyc.entity.ApplicationUserSourav;

public interface ApplicationUserSouravService {
public ApplicationUserSourav saveAllUser(ApplicationUserSourav applicationUserSourav);
public ApplicationUserSourav getUserById(int user_id);
public void deleteUserById(int user_id);
public List<ApplicationUserSourav> getByAll();


}
