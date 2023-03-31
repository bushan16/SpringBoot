package com.matilda.junitdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.matilda.junitdemo.entity.MatildaUserEntity;
import com.matilda.junitdemo.model.MatildaUser;
import com.matilda.junitdemo.repository.MatildaUserRepository;

@Service
public class MatildaUserService {
	
	@Autowired
	private MatildaUserRepository userRepository;
	
	public List<MatildaUser> getUsersList() {
		List<MatildaUser> userList = new ArrayList<MatildaUser>();
		
		List<MatildaUserEntity> entityList = userRepository.findAll();
		
		if(!CollectionUtils.isEmpty(entityList)) {
			userList = entityList.stream().map(this::mapEntity).collect(Collectors.toList());
		} else {
			return new ArrayList<>();
		}
		
		return userList;
	}

	private MatildaUser mapEntity(MatildaUserEntity matildaUserEntity) {
		MatildaUser user = new MatildaUser();
		return user;
	}

}
