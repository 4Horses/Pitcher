package com.fourhorses.pitcherbe.organization_account.dto;

import com.fourhorses.pitcherbe.account.dto.AccountDto;
import lombok.Data;

@Data
public class OrganizationAccountDto extends AccountDto {
    private String name;
    private String website;
}
