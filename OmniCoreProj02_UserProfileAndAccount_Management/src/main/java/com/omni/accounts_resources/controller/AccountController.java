package com.omni.accounts_resources.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omni.accounts.model.Account;
import com.omni.accounts.service.IAccountService;
import com.omni.accounts_resources.dto.AccountRequestDto;
import com.omni.accounts_resources.dto.AccountResponseDto;
import com.omni.accounts_resources.handler.AccountHandler;
import com.omni.accounts_resources.mapper.AccountRequestMapper;
import com.omni.accounts_resources.mapper.AccountResponseMapper;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	private IAccountService accountService;
	
	public AccountController(IAccountService accountService) {
		this.accountService=accountService;
	}
	
	@PostMapping
	public AccountResponseDto createAccount(@RequestBody AccountRequestDto accountReqDto){
		AccountHandler.validate(accountReqDto);
		Account accountEntity = AccountRequestMapper.toEntity(accountReqDto);
		Optional<Account> account = accountService.createAccount(accountEntity);
		AccountResponseDto accountResponseDto = AccountResponseMapper.toDto(account.orElse(null));
		return accountResponseDto;
	}
	
	@GetMapping("/{id}")
	public AccountResponseDto getAccountById(@PathVariable Long id){
		Optional<Account> accountById = accountService.getAccountById(id);
		AccountResponseDto accountDto = AccountResponseMapper.toDto(accountById.orElse(null));
		return accountDto;
	}
	
	@GetMapping
	public List<AccountResponseDto> getAllAccount(){
		List<Account> allAccount = accountService.getAllAccount();
		return allAccount.stream().map(AccountResponseMapper::toDto).toList();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAccountById(@PathVariable Long id) {
		String message = accountService.deleteAccountById(id);
		return ResponseEntity.ok(message);
	}
	
	
	
}
