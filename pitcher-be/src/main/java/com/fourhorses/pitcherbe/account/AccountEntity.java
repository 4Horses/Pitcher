package com.fourhorses.pitcherbe.account;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@MappedSuperclass
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

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
