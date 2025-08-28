package com.omni.profile.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omni.profile.model.Profile;
import com.omni.profile.repository.ProfileRepository;

@Service 
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile getProfile(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    @Override
    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }
}
