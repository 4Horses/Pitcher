package com.fourhorses.pitcherbe.organization_account.service;

import com.fourhorses.pitcherbe.organization_account.repository.OrganizationAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrganizationAccountServiceImpl implements OrganizationAccountService{
    private final OrganizationAccountRepository organizationAccountRepository;
}
