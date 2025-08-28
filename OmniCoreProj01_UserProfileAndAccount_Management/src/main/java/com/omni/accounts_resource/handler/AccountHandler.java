package com.omni.accounts_resource.handler;

import com.omni.accounts_resource.mapper.AccountRequestDto;

public class AccountHandler {

    public static void validate(AccountRequestDto dto) {
        if (dto.getUsername() == null || dto.getUsername().isBlank()) {
            throw new IllegalArgumentException("Username is required");
        }
        if (dto.getEmail() == null || !dto.getEmail().contains("@")) {
            throw new IllegalArgumentException("Valid email is required");
        }
    }
}
