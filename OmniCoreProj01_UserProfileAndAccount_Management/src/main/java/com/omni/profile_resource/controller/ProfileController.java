package com.omni.profile_resource.controller;

import com.omni.profile.model.Profile;
import com.omni.profile.service.ProfileService;
import com.omni.profile_resource.handler.ProfileHandler;
import com.omni.profile_resource.mapper.ProfileRequestDto;
import com.omni.profile_resource.mapper.ProfileRequestMapper;
import com.omni.profile_resource.mapper.ProfileResponseDto;
import com.omni.profile_resource.mapper.ProfileResponseMapper;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping
    public ProfileResponseDto createProfile(@RequestBody ProfileRequestDto dto) {
        ProfileHandler.validate(dto);
        Profile profile = profileService.createProfile(ProfileRequestMapper.toEntity(dto));
        return ProfileResponseMapper.toDto(profile);
    }

    @GetMapping("/{id}")
    public ProfileResponseDto getProfile(@PathVariable Long id) {
        Profile profile = profileService.getProfile(id);
        return ProfileResponseMapper.toDto(profile);
    }

    @GetMapping
    public List<ProfileResponseDto> getAllProfiles() {
        return profileService.getAllProfiles()
                .stream()
                .map(ProfileResponseMapper::toDto)
                .collect(Collectors.toList());
    }
}
