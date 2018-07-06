package com.example.demo.util;

public enum RoleEnum {

	ROLE_USER("ROLE_USER"),
	ROLE_ADMIN("ROLE_ADMIN");
	
	private String name;
	
	RoleEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
