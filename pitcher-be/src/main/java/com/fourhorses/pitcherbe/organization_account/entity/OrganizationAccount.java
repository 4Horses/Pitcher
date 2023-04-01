package com.fourhorses.pitcherbe.organization_account.entity;

import com.fourhorses.pitcherbe.account.AccountEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@Table(name = "organization_account", schema = "public", catalog = "pitcher")
public class OrganizationAccount extends AccountEntity {
}
