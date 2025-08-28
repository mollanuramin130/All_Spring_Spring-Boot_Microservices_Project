package com.omni.accounts_resources.handler;

import com.omni.accounts_resources.dto.AccountRequestDto;

public class AccountHandler {
	public static void validate(AccountRequestDto accountRequestDto) {
		if(accountRequestDto.getUsername()==null|| accountRequestDto.getUsername().isBlank()) {
			throw new IllegalArgumentException("Username Required");
		}
		if(accountRequestDto.getEmail()==null|| accountRequestDto.getEmail().isBlank()) {
			throw new IllegalArgumentException("Email Required");
		}
	}
}
