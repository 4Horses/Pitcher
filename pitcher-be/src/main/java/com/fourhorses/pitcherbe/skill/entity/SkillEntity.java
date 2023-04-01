package com.fourhorses.pitcherbe.skill.entity;

import com.fourhorses.pitcherbe.common.base_entity.BaseEntity;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "skill", schema = "public", catalog = "pitcher")
public class SkillEntity extends BaseEntity {

    @Basic
    @Column(name = "name", length = 100)
    private String name;
}
