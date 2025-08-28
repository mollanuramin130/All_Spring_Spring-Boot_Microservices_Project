package com.omni.profile_resource.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileRequestDto {
    private Long id;
    private String name;
    private String email;
}
