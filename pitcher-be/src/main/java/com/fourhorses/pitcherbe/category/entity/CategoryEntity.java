package com.fourhorses.pitcherbe.category.entity;

import com.fourhorses.pitcherbe.common.base_entity.BaseEntity;
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
@Table(name = "category", schema = "public", catalog = "pitcher")
public class CategoryEntity extends BaseEntity {
    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<ProjectEntity> projectEntities;
}
