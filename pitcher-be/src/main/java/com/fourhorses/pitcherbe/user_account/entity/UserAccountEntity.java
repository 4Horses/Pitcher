package com.fourhorses.pitcherbe.user_account.entity;

import com.fourhorses.pitcherbe.common.account.AccountEntity;
import com.fourhorses.pitcherbe.project.entity.ProjectEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_account", schema = "public", catalog = "pitcher")
public class UserAccountEntity extends AccountEntity {

    @Basic
    @Column(name = "first_name", length = 50)
    private String firstName;

    @Basic
    @Column(name = "last_name", length = 50)
    private String lastName;

    @OneToMany(mappedBy = "userAccount", fetch = FetchType.LAZY)
    private List<ProjectEntity> projectEntities;
}
