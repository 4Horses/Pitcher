package com.fourhorses.pitcherbe.skill.service;

import com.fourhorses.pitcherbe.skill.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SkillServiceImpl implements SkillService {
    private final SkillRepository skillRepository;
}
