package com.omni.accounts_resources.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountRequestDto {
	private Long id;
	private String username;
	private String email;
}
