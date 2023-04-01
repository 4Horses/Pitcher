package com.fourhorses.pitcherbe.user_account.entity;

import com.fourhorses.pitcherbe.account.AccountEntity;
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
@Table(name = "user_account", schema = "public", catalog = "pitcher")
public class UserAccount extends AccountEntity {

    @Basic
    @Column(name = "first_name", length = 50)
    private String firstName;

    @Basic
    @Column(name = "last_name", length = 50)
    private String lastName;
}
