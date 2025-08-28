package com.omni.accounts_resource.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omni.accounts.model.Account;
import com.omni.accounts.service.AccountService;
import com.omni.accounts_resource.handler.AccountHandler;
import com.omni.accounts_resource.mapper.AccountRequestDto;
import com.omni.accounts_resource.mapper.AccountRequestMapper;
import com.omni.accounts_resource.mapper.AccountResponseDto;
import com.omni.accounts_resource.mapper.AccountResponseMapper;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public AccountResponseDto createAccount(@RequestBody AccountRequestDto dto) {
        AccountHandler.validate(dto);
        Account account = accountService.createAccount(AccountRequestMapper.toEntity(dto));
        return AccountResponseMapper.toDto(account);
    }

    @GetMapping("/{id}")
    public AccountResponseDto getAccount(@PathVariable Long id) {
        Account account = accountService.getAccount(id);
        return AccountResponseMapper.toDto(account);
    }

    @GetMapping
    public List<AccountResponseDto> getAllAccounts() {
        return accountService.getAllAccounts()
                .stream()
                .map(AccountResponseMapper::toDto)
                .collect(Collectors.toList());
    }
}
