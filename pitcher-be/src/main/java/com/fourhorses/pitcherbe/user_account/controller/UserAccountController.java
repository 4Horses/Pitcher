package com.fourhorses.pitcherbe.user_account.controller;

import com.fourhorses.pitcherbe.user_account.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserAccountController {
    private final UserAccountService userAccountService;
}
