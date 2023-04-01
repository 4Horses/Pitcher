package com.fourhorses.pitcherbe.user_account.service;

import com.fourhorses.pitcherbe.user_account.dto.UserAccountDto;
import com.fourhorses.pitcherbe.user_account.entity.UserAccountEntity;
import com.fourhorses.pitcherbe.user_account.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional
public class UserAccountServiceImpl implements UserAccountService {
    private final UserAccountRepository userAccountRepository;

    private final ModelMapper modelMapper;

    @Override
    public UserAccountDto register(UserAccountDto userAccountDto) {
        UserAccountEntity userAccountEntity = UserAccountEntity.builder()
                .firstName(userAccountDto.getFirstName())
                .lastName(userAccountDto.getLastName())
                .address(userAccountDto.getAddress())
                .phoneNumber(userAccountDto.getPhoneNumber())
                .email(userAccountDto.getEmail())
                .password(userAccountDto.getPassword())
                .build();

        var savedUser = userAccountRepository.save(userAccountEntity);
        return modelMapper.map(savedUser, UserAccountDto.class);
    }
}
