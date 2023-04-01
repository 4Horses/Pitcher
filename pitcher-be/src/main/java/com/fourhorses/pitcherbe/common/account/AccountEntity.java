package com.fourhorses.pitcherbe.common.account;

import com.fourhorses.pitcherbe.common.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@MappedSuperclass
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
}
