package com.omni.accounts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omni.accounts.model.Account;
import com.omni.accounts.repository.IAccountRepository;

@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
	private IAccountRepository accountRepository;

	@Override
	public Optional<Account> createAccount(Account acc) {
		Account account = accountRepository.save(acc);
		return Optional.ofNullable(account);
	}

	@Override
	public Optional<Account> getAccountById(Long id) {
		Optional<Account> account = accountRepository.findById(id);
		return account;
	}

	@Override
	public List<Account> getAllAccount() {
		List<Account> allAccounts = accountRepository.findAll();
		return allAccounts;
	}

	@Override
	public String deleteAccountById(Long id) {
		accountRepository.deleteById(id);
		return "deleted";
	}

}
