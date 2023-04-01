package com.fourhorses.pitcherbe.skill_progression.repository;

import com.fourhorses.pitcherbe.skill_progression.entity.SkillProgressionEntity;
import com.fourhorses.pitcherbe.skill_progression.entity.SkillProgressionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillProgressionRepository extends JpaRepository<SkillProgressionEntity, SkillProgressionId> {
}
