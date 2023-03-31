package com.matilda.junitdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.matilda.junitdemo.model.MatildaUser;
import com.matilda.junitdemo.service.MatildaUserService;

//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class MatildaUserControllerTest {

	@InjectMocks
	private MatildaUserController userController;

	@Mock
	private MatildaUserService userService;

	@BeforeEach
	public void setUp() {
	   MockitoAnnotations.openMocks(this);
	}

	@Test
	void loadUser() throws Exception {

		List<MatildaUser> mockedUserList = new ArrayList<MatildaUser>();
		Mockito.when(userService.getUsersList()).thenReturn(mockedUserList);
		List<MatildaUser> userList = this.userController.loadUsers();

		Assertions.assertNotNull(userList);
	}
}
