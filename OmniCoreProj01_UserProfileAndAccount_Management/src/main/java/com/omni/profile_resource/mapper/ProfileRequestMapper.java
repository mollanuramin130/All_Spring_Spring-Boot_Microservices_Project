package com.omni.profile_resource.mapper;

import com.omni.profile.model.Profile;

public class ProfileRequestMapper {
    public static Profile toEntity(ProfileRequestDto dto) {
        return new Profile(dto.getId(), dto.getName(), dto.getEmail());
    }
}
