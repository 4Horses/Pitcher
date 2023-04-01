package com.fourhorses.pitcherbe.user_account.repository;

import com.fourhorses.pitcherbe.user_account.entity.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Long> {
}
