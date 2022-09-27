package com.fdmgroup.userregistration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserRegistrationControllerTest {

	@Mock
	UserPersistance mockUP;
	
	@Test
	public void addUser_should_pass_in_user_to_writeUser_method_on_up() {
		
		//arrange
		UserRegistrationController controller = new UserRegistrationController(mockUP);
		User bob = new User(1, "Robert");
		
		//act
		controller.addUser(bob);
		
		//assert
		verify(mockUP, times(1)).writeUser(bob);
		
	}

	@Test
	public void addUser_should_pass_in_user_to_writeUser_twice_if_called_twice() {
		
		//arrange
		UserRegistrationController controller = new UserRegistrationController(mockUP);
		User bob = new User(1, "Robert");
		
		//act
		controller.addUser(bob);
		controller.addUser(bob);
		
		//assert
		verify(mockUP, times(2)).writeUser(bob);
		
	}
	
	
	@Test
	public void getUser_should_pass_in_id_to_readUser_method_on_up() {
		
		//arrange
		UserRegistrationController controller = new UserRegistrationController(mockUP);
		
		//act
		controller.getUser(1);
		
		//assert
		verify(mockUP).readUser(1);
		
	}

	@Test
	public void getUser_should_return_the_user_that_the_readUser_method_on_up_returned() {
		
		//arrange
		UserRegistrationController controller = new UserRegistrationController(mockUP);
		User bob = new User(1, "Robert");
		when(mockUP.readUser(1)).thenReturn(bob);
		
		
		//act
		User returnedUser = controller.getUser(1);
		
		//assert
		assertEquals(bob, returnedUser);
		
	}
	
	
	
	
}
