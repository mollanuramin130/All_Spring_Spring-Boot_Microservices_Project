package com.omni.accounts.service;

import com.omni.accounts.model.Account;
import java.util.List;

public interface AccountService {
    Account createAccount(Account account);
    Account getAccount(Long id);
    List<Account> getAllAccounts();
}
