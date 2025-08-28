package com.omni.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omni.accounts.model.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Long> {

}
