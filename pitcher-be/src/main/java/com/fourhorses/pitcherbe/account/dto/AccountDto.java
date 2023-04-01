package com.fourhorses.pitcherbe.account.dto;

import lombok.Data;

@Data
public class AccountDto {
    protected Long id;
    protected String email;
    protected String password;
    protected String phoneNumber;
    protected String address;
}
