package com.omni.accounts_resources.mapper;

import com.omni.accounts.model.Account;
import com.omni.accounts_resources.dto.AccountRequestDto;

public class AccountRequestMapper {
	private AccountRequestMapper() {
		
	}
	
	public static Account toEntity(AccountRequestDto requestDto) {
		return new Account(requestDto.getUsername(), requestDto.getEmail());
	}
}
