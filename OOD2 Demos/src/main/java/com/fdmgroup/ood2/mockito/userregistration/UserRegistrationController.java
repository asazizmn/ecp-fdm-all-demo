package com.fdmgroup.ood2.mockito.userregistration;

public class UserRegistrationController {

	private UserPersistance userPersistance;
	
	public UserRegistrationController(UserPersistance userPersistance) {
		this.userPersistance = userPersistance;
	}

	public void addUser(User user) {
		userPersistance.writeUser(user);
	}

	public User getUser(int id) {
		return userPersistance.readUser(id);
	}

}
