package com.fourhorses.pitcherbe.skill_progression.controller;

import com.fourhorses.pitcherbe.skill_progression.service.SkillProgressionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class SkillProgressionController {
    private final SkillProgressionService skillProgressionService;
}
