package com.fourhorses.pitcherbe.account.controller;

import com.fourhorses.pitcherbe.account.dto.LoginDto;
import com.fourhorses.pitcherbe.account.service.AccountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<Void> longin(@Valid @RequestBody LoginDto loginDto) {
        HttpStatus status = accountService.login(loginDto).isPresent() ? HttpStatus.OK : HttpStatus.FORBIDDEN;
        return new ResponseEntity<>(status);
    }
}
