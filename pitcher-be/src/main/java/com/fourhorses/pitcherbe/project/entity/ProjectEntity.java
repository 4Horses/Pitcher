package com.fourhorses.pitcherbe.project.entity;

import com.fourhorses.pitcherbe.category.entity.CategoryEntity;
import com.fourhorses.pitcherbe.common.base_entity.BaseEntity;
import com.fourhorses.pitcherbe.user_account.entity.UserAccountEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "project", schema = "public", catalog = "pitcher")
public class ProjectEntity extends BaseEntity {
    @Basic
    @Column(name = "name", length = 100)
    private String name;

    @Basic
    @Column(name = "description", length = 1000)
    private String description;

    @Basic
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Basic
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Basic
    @Column(name = "end_date")
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "user_account_id")
    private UserAccountEntity userAccount;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
