package com.fourhorses.pitcherbe.user_account.service;

import com.fourhorses.pitcherbe.user_account.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserAccountServiceImpl implements UserAccountService {
    private final UserAccountRepository userAccountRepository;
}
