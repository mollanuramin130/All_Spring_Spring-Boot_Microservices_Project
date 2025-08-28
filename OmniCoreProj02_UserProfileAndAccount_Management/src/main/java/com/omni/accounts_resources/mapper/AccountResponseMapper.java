package com.omni.accounts_resources.mapper;

import com.omni.accounts.model.Account;
import com.omni.accounts_resources.dto.AccountResponseDto;

public class AccountResponseMapper {
	public static AccountResponseDto toDto(Account account) {
		return new AccountResponseDto(account.getId(), account.getUsername(), account.getEmail());
	}
}
