package com.omni.accounts.repository;

import com.omni.accounts.model.Account;
import java.util.List;

public interface AccountRepository {

    Account save(Account account);

    Account findById(Long id);

    List<Account> findAll();
}
