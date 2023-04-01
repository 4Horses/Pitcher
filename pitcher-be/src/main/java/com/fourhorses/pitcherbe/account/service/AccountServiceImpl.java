package com.fourhorses.pitcherbe.account.service;

import com.fourhorses.pitcherbe.account.dto.AccountDto;
import com.fourhorses.pitcherbe.account.dto.LoginDto;
import com.fourhorses.pitcherbe.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;

    @Override
    public Optional<AccountDto> login(LoginDto accountDto) {
        var account = accountRepository.findByEmail(accountDto.getEmail());

        if (account.isPresent() && (account.get().getPassword().equals(accountDto.getPassword())))
            return Optional.of(modelMapper.map(account.get(), AccountDto.class));

        return Optional.empty();
    }
}
