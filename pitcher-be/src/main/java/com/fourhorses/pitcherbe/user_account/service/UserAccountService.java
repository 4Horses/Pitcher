package com.fourhorses.pitcherbe.user_account.service;

import com.fourhorses.pitcherbe.user_account.dto.UserAccountDto;
import com.fourhorses.pitcherbe.user_account.entity.UserAccountEntity;

import java.util.Optional;

public interface UserAccountService {
    UserAccountDto register(UserAccountDto userAccountDto);

   UserAccountEntity getUserAccountEntityById(Long id);
}
