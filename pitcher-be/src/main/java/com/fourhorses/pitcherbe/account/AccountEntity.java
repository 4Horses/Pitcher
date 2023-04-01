package com.fourhorses.pitcherbe.account;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@Getter
@Setter
@MappedSuperclass
public class AccountEntity {
    @Id
    protected Long id;

    @Basic
    @Column(name = "address", length = 200)
    protected String address;

    @Basic
    @Column(name = "phone_number", length = 15)
    protected String phoneNumber;
}
