package com.fourhorses.pitcherbe.user_account.dto;

import com.fourhorses.pitcherbe.account.dto.AccountDto;
import lombok.Data;

@Data
public class UserAccountDto extends AccountDto {
    private String firstName;
    private String lastName;
}
