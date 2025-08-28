package com.omni.profile_resource.handler;

import com.omni.profile_resource.mapper.ProfileRequestDto;

public class ProfileHandler {

    public static void validate(ProfileRequestDto dto) {
        if (dto.getName() == null || dto.getName().isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }
        if (dto.getEmail() == null || !dto.getEmail().contains("@")) {
            throw new IllegalArgumentException("Valid email is required");
        }
    }
}
