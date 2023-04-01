package com.fourhorses.pitcherbe.organization_account.repository;

import com.fourhorses.pitcherbe.organization_account.entity.OrganizationAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationAccountRepository extends JpaRepository<OrganizationAccountEntity, Long> {
}
