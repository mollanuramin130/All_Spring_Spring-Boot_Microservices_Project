package com.omni.services;

import com.omni.model.UserProfile;

public interface UserProfileService {

	public UserProfile createRegister(UserProfile user);

	public void deleteById(Long id);
}
