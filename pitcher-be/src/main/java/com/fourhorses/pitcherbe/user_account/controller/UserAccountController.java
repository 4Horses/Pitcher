package com.fourhorses.pitcherbe.user_account.controller;

import com.fourhorses.pitcherbe.user_account.dto.UserAccountDto;
import com.fourhorses.pitcherbe.user_account.service.UserAccountService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserAccountController {
    private final UserAccountService userAccountService;

    @Operation(summary = "Register a new user")
    @PostMapping
    public ResponseEntity<UserAccountDto> register(@RequestBody UserAccountDto userAccountDto) {
        return ResponseEntity.ok(userAccountService.register(userAccountDto));
    }

    @Operation(summary = "Get a user by id")
    @GetMapping("/{id}")
    public ResponseEntity<UserAccountDto> getUserAccount(@PathVariable Long id) {
        return ResponseEntity.ok(userAccountService.getUserAccountById(id));
    }

    @Operation(summary = "Get all users")
    @GetMapping()
    public ResponseEntity<List<UserAccountDto>> getAllUserAccount() {
        var userAccounts = userAccountService.getAllUserAccount();

        HttpStatus status = userAccounts.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(userAccounts, status);
    }

    @Operation(summary = "Update a user")
    @PatchMapping()
    public ResponseEntity<UserAccountDto> updateUserAccount(@RequestBody UserAccountDto userAccountDto) {
        return ResponseEntity.ok(userAccountService.updateUserAccount(userAccountDto));
    }
}
