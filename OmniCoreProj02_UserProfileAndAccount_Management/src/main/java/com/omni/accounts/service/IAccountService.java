package com.omni.accounts.service;

import java.util.List;
import java.util.Optional;

import com.omni.accounts.model.Account;

public interface IAccountService {
	public Optional<Account> createAccount(Account acc);
	public Optional<Account> getAccountById(Long id);
	public List<Account> getAllAccount();
	public String deleteAccountById(Long id);
	
}
