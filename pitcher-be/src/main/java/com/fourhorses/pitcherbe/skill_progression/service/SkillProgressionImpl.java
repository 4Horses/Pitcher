package com.fourhorses.pitcherbe.skill_progression.service;

import com.fourhorses.pitcherbe.skill_progression.repository.SkillProgressionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SkillProgressionImpl implements SkillProgressionService{
    private final SkillProgressionRepository skillProgressionRepository;
}
