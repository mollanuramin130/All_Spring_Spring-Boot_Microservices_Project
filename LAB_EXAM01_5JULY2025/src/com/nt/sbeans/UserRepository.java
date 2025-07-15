package com.nt.sbeans;

public class UserRepository {
	private String userRepository;

	public UserRepository(String userRepository) {
		super();
		this.userRepository = userRepository;
		System.out.println("UserRepository Set Via Constructor Injection");

	}

	public String getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(String userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public String toString() {
		return "UserRepository [userRepository=" + userRepository + "]";
	}
	
}
