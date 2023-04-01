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
    @Column(name = "name", length = 50)
    private String name;

    @Basic
    @Column(name = "description", length = 150)
    private String description = "";

    @Basic
    @Column(name = "image_path", length = 150)
    private String imagePath;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<ProjectEntity> projectEntities;
}
