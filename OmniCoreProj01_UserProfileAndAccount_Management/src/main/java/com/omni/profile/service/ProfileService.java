package com.omni.profile.service;

import com.omni.profile.model.Profile;
import java.util.List;

public interface ProfileService {
    Profile createProfile(Profile profile);
    Profile getProfile(Long id);
    List<Profile> getAllProfiles();
}
