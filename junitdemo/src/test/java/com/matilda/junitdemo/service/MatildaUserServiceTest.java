package com.matilda.junitdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.matilda.junitdemo.entity.MatildaUserEntity;
import com.matilda.junitdemo.model.MatildaUser;
import com.matilda.junitdemo.repository.MatildaUserRepository;

//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class MatildaUserServiceTest {

	@InjectMocks
	private MatildaUserService userService;
	
	@Mock
	private MatildaUserRepository userRepository;
		
	@BeforeEach
	public void setUp() {
	   MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void testgetUsers() throws Exception {
		
		List<MatildaUserEntity> userEntityList = new ArrayList<MatildaUserEntity>();
		
		MatildaUserEntity userEntity = new MatildaUserEntity();
		userEntityList.add(userEntity);
		
		Mockito.when(userRepository.findAll()).thenReturn(userEntityList);
		
		List<MatildaUser> userList = this.userService.getUsersList();
	}
	
	@Test
	void testgetUsersEmptyList() throws Exception {
		
		List<MatildaUserEntity> userEntityList = new ArrayList<MatildaUserEntity>();
		
		Mockito.when(userRepository.findAll()).thenReturn(userEntityList);
		
		List<MatildaUser> userList = this.userService.getUsersList();
	}
}
