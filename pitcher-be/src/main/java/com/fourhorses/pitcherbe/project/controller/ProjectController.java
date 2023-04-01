package com.fourhorses.pitcherbe.project.controller;

import com.fourhorses.pitcherbe.project.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProjectController {
    private final ProjectService projectService;
}
