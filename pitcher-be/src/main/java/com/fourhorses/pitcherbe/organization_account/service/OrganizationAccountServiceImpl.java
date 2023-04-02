package com.fourhorses.pitcherbe.organization_account.service;

import com.fourhorses.pitcherbe.common.exception.BusinessException;
import com.fourhorses.pitcherbe.organization_account.dto.OrganizationAccountDto;
import com.fourhorses.pitcherbe.organization_account.entity.OrganizationAccountEntity;
import com.fourhorses.pitcherbe.organization_account.repository.OrganizationAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrganizationAccountServiceImpl implements OrganizationAccountService {
    private final OrganizationAccountRepository organizationAccountRepository;
    private final ModelMapper modelMapper;

    @Override
    public OrganizationAccountDto register(OrganizationAccountDto organizationAccountDto) {
        log.info("Request to register organization account: {}", organizationAccountDto);
        OrganizationAccountEntity organizationAccountEntity = OrganizationAccountEntity.builder()
                .name(organizationAccountDto.getName())
                .email(organizationAccountDto.getEmail())
                .password(organizationAccountDto.getPassword())
                .address(organizationAccountDto.getAddress())
                .phoneNumber(organizationAccountDto.getPhoneNumber())
                .website(organizationAccountDto.getWebsite())
                .build();

        var savedOrganizationAccountEntity = organizationAccountRepository.save(organizationAccountEntity);

        return modelMapper.map(savedOrganizationAccountEntity, OrganizationAccountDto.class);
    }

    @Override
    public OrganizationAccountDto getOrganizationAccountById(Long id) {
        log.info("Request to get organization account by id: {}", id);
        var organizationAccountEntity = organizationAccountRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Organization account not found"));

        return modelMapper.map(organizationAccountEntity, OrganizationAccountDto.class);
    }

    @Override
    public List<OrganizationAccountDto> getAllOrganizationAccount() {
        log.info("Request to get all organization accounts");
        var organizationAccountEntities = organizationAccountRepository.findAll();

        return modelMapper.map(organizationAccountEntities, new TypeToken<List<OrganizationAccountDto>>() {
        }.getType());
    }

    @Override
    public OrganizationAccountEntity getOrganizationAccountEntityById(Long id) {
        log.info("Request to get organization account entity by id: {}", id);
        return organizationAccountRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Organization account not found"));
    }
}
