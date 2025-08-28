package com.omni.accounts_resource.mapper;

import com.omni.accounts.model.Account;

public class AccountRequestMapper {
    public static Account toEntity(AccountRequestDto dto) {
        return new Account(dto.getId(), dto.getUsername(), dto.getEmail());
    }
}
