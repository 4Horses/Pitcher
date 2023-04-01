package com.fourhorses.pitcherbe.user_account.controller;

import com.fourhorses.pitcherbe.user_account.dto.UserAccountDto;
import com.fourhorses.pitcherbe.user_account.service.UserAccountService;
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

    @PostMapping
    public ResponseEntity<UserAccountDto> register(@RequestBody UserAccountDto userAccountDto) {
        return ResponseEntity.ok(userAccountService.register(userAccountDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAccountDto> getUserAccount(@PathVariable Long id) {
        return ResponseEntity.ok(userAccountService.getUserAccountById(id));
    }

    @GetMapping()
    public ResponseEntity<List<UserAccountDto>> getAllUserAccount() {
        var userAccounts = userAccountService.getAllUserAccount();

        HttpStatus status = userAccounts.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(userAccounts, status);
    }

    @PatchMapping()
    public ResponseEntity<UserAccountDto> updateUserAccount(@RequestBody UserAccountDto userAccountDto) {
        return ResponseEntity.ok(userAccountService.updateUserAccount(userAccountDto));
    }
}
