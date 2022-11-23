package com.fdmgroup.ood2.mockito.userregistration;

public interface UserPersistance {

	void writeUser(User bob);

	User readUser(int i);

}
