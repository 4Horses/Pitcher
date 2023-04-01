package com.fourhorses.pitcherbe.account.service;

import com.fourhorses.pitcherbe.account.dto.AccountDto;
import com.fourhorses.pitcherbe.account.dto.LoginDto;

import java.util.Optional;

public interface AccountService {
    Optional<AccountDto> login(LoginDto accountDto);
}
