package com.fourhorses.pitcherbe.organization_account.entity;

import com.fourhorses.pitcherbe.account.entity.AccountEntity;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "organization_account", schema = "public", catalog = "pitcher")
public class OrganizationAccountEntity extends AccountEntity {

    @Basic
    @Column(name = "name", length = 50)
    private String name;
}
