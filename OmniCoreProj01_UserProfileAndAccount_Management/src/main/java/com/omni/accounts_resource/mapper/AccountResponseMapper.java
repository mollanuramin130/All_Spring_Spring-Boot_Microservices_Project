package com.omni.accounts_resource.mapper;

import com.omni.accounts.model.Account;

public class AccountResponseMapper {
    public static AccountResponseDto toDto(Account account) {
        return new AccountResponseDto(account.getId(), account.getUsername(), account.getEmail());
    }
}
