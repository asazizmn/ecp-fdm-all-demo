package com.fdmgroup.userregistration;

public interface UserPersistance {

	void writeUser(User bob);

	User readUser(int i);

}
