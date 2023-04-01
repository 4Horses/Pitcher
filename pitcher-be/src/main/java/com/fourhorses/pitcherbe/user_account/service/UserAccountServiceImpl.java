package com.fourhorses.pitcherbe.user_account.service;

import com.fourhorses.pitcherbe.common.exception.BusinessException;
import com.fourhorses.pitcherbe.user_account.dto.UserAccountDto;
import com.fourhorses.pitcherbe.user_account.entity.UserAccountEntity;
import com.fourhorses.pitcherbe.user_account.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public UserAccountEntity getUserAccountEntityById(Long id) {
        return userAccountRepository.findById(id)
                .orElseThrow(() -> new BusinessException("User not found"));
    }

    @Override
    public UserAccountDto getUserAccountById(Long id) {
        var userAccount = getUserAccountEntityById(id);
        return modelMapper.map(userAccount, UserAccountDto.class);
    }

    @Override
    public List<UserAccountDto> getAllUserAccount() {
        var userAccounts = userAccountRepository.findAll();
        return modelMapper.map(userAccounts, new TypeToken<List<UserAccountDto>>() {
        }.getType());
    }

    @Override
    public UserAccountDto updateUserAccount(UserAccountDto userAccountDto) {
        UserAccountEntity userAccountEntity = getUserAccountEntityById(userAccountDto.getId());
        userAccountEntity.setFirstName(userAccountDto.getFirstName());
        userAccountEntity.setLastName(userAccountDto.getLastName());
        userAccountEntity.setAddress(userAccountDto.getAddress());
        userAccountEntity.setPhoneNumber(userAccountDto.getPhoneNumber());
        userAccountEntity.setEmail(userAccountDto.getEmail());
        userAccountEntity.setPassword(userAccountDto.getPassword());

        var savedUser = userAccountRepository.save(userAccountEntity);
        return modelMapper.map(savedUser, UserAccountDto.class);
    }
}
