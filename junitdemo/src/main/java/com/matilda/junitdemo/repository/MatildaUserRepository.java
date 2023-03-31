package com.matilda.junitdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matilda.junitdemo.entity.MatildaUserEntity;

@Repository
public interface MatildaUserRepository extends MongoRepository<MatildaUserEntity, String>{

}
