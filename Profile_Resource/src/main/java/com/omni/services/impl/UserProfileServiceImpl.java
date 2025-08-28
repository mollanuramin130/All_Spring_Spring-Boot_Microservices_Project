package com.omni.services.impl;

import org.springframework.stereotype.Service;

import com.omni.model.UserProfile;
import com.omni.repository.UserProfileRepository;
import com.omni.services.UserProfileService;

import io.micrometer.common.lang.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {

	@NonNull
	private final UserProfileRepository userRepo;

 	@Override
	public UserProfile createRegister(UserProfile user) {
 		return userRepo.save(user);

	}

	@Override
	public void deleteById(Long id) {
		userRepo.deleteById(id);
	}

}
