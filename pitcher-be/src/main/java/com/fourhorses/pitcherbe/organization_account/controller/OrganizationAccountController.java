package com.fourhorses.pitcherbe.organization_account.controller;

import com.fourhorses.pitcherbe.organization_account.service.OrganizationAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrganizationAccountController {
    private final OrganizationAccountService organizationAccountService;
}
