package com.fourhorses.pitcherbe.user_account.entity;

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
@Table(name = "user_account", schema = "public", catalog = "pitcher")
public class UserAccount extends AccountEntity {
}
