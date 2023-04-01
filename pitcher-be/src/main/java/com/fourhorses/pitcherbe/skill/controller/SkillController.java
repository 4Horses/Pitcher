package com.fourhorses.pitcherbe.skill.controller;

import com.fourhorses.pitcherbe.skill.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SkillController {
    private final SkillService skillService;
}
