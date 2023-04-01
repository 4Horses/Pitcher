package com.fourhorses.pitcherbe.skill_progression.entity;


import com.fourhorses.pitcherbe.common.base_entity.BaseEntity;
import com.fourhorses.pitcherbe.skill.entity.SkillEntity;
import com.fourhorses.pitcherbe.user_account.entity.UserAccountEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "skill_progression", schema = "public", catalog = "pitcher")
public class SkillProgressionEntity{

    @EmbeddedId
    private SkillProgressionId skillProgressionId;

    @ManyToOne
    @MapsId("skillId")
    private SkillEntity skillEntity;

    @ManyToOne
    @MapsId("userId")
    private UserAccountEntity userAccountEntity;

    @Basic
    @Column(name = "experience")
    private Long experience;
}
