package com.fourhorses.pitcherbe.user_account.entity;

import com.fourhorses.pitcherbe.account.entity.AccountEntity;
import com.fourhorses.pitcherbe.project.entity.ProjectEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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

    @Builder
    public UserAccountEntity(String address, String phoneNumber, String email, String password, String firstName, String lastName, List<ProjectEntity> projectEntities) {
        super(address, phoneNumber, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.projectEntities = projectEntities;
    }
}
