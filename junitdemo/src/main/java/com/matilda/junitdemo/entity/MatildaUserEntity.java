package com.matilda.junitdemo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MatildaUserEntity {
	
	private int matildaUserId;
	private String matildaUserName;
	private String matildaRoleName;
	
	
}
