package com.fourhorses.pitcherbe.organization_account.controller;

import com.fourhorses.pitcherbe.organization_account.dto.OrganizationAccountDto;
import com.fourhorses.pitcherbe.organization_account.service.OrganizationAccountService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/organization")
public class OrganizationAccountController {
    private final OrganizationAccountService organizationAccountService;

    @Operation(summary = "Register a new organization")
    @PostMapping
    public ResponseEntity<OrganizationAccountDto> register(@RequestBody OrganizationAccountDto organizationAccountDto) {
        return ResponseEntity.ok(organizationAccountService.register(organizationAccountDto));
    }

    @Operation(summary = "Get an organization by id")
    @GetMapping("/{id}")
    public ResponseEntity<OrganizationAccountDto> getOrganizationAccount(@PathVariable Long id) {
        return ResponseEntity.ok(organizationAccountService.getOrganizationAccountById(id));
    }

    @Operation(summary = "Get all organizations")
    @GetMapping()
    public ResponseEntity<List<OrganizationAccountDto>> getAllOrganizationAccount() {
        var organizationAccounts = organizationAccountService.getAllOrganizationAccount();

        HttpStatus status = organizationAccounts.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(organizationAccounts, status);
    }
}
