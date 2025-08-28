package com.omni.account_adapter;

import com.omni.accounts.model.Account;
import com.omni.accounts.repository.AccountRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    private final Map<Long, Account> store = new HashMap<>();

    @Override
    public Account save(Account account) {
        store.put(account.getId(), account);
        return account;
    }

    @Override
    public Account findById(Long id) {
        return store.get(id);
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(store.values());
    }
}
