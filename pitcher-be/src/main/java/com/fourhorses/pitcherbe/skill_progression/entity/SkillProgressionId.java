package com.fourhorses.pitcherbe.skill_progression.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SkillProgressionId implements Serializable {
    @Column(name = "skill_id")
    private Long skillId;
    @Column(name = "user_id")
    private Long userId;
}
