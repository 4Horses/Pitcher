package com.fourhorses.pitcherbe.organization_account.service;

import com.fourhorses.pitcherbe.organization_account.dto.OrganizationAccountDto;
import com.fourhorses.pitcherbe.organization_account.entity.OrganizationAccountEntity;

import java.util.List;

public interface OrganizationAccountService {
    OrganizationAccountDto register(OrganizationAccountDto organizationAccountDto);

    OrganizationAccountDto getOrganizationAccountById(Long id);

    List<OrganizationAccountDto> getAllOrganizationAccount();

    OrganizationAccountEntity getOrganizationAccountEntityById(Long id);
}
