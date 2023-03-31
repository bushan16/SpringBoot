package com.matilda.junitdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MatildaUser {

	private int matildaUserId;
	private String matildaUserName;
	private String matildaRoleName;
}
