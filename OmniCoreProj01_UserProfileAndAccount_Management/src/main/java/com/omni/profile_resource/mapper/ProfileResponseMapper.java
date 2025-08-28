package com.omni.profile_resource.mapper;

import com.omni.profile.model.Profile;

public class ProfileResponseMapper {
    public static ProfileResponseDto toDto(Profile profile) {
        return new ProfileResponseDto(profile.getId(), profile.getName(), profile.getEmail());
    }
}
