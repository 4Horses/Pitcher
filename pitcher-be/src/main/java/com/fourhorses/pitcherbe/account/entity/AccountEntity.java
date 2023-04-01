package com.fourhorses.pitcherbe.account.entity;

import com.fourhorses.pitcherbe.common.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "account", schema = "public", catalog = "pitched")
public class AccountEntity extends BaseEntity {
    @Basic
    @Column(name = "address", length = 200)
    protected String address;

    @Basic
    @Column(name = "phone_number", length = 15)
    protected String phoneNumber;

    @Basic
    @Column(name = "email", length = 50)
    protected String email;

    @Basic
    @Column(name = "password", length = 100)
    protected String password;
}
