package com.fourhorses.pitcherbe.category.entity;

import com.fourhorses.pitcherbe.common.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "category", schema = "public", catalog = "pitcher")
public class CategoryEntity extends BaseEntity {
    @Basic
    @Column(name = "name")
    private String name;
}
