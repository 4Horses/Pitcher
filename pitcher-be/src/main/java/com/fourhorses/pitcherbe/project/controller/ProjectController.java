package com.fourhorses.pitcherbe.project.controller;

import com.fourhorses.pitcherbe.project.dto.ProjectDto;
import com.fourhorses.pitcherbe.project.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping()
    public ResponseEntity<List<ProjectDto>> getProjects() {
        var projects =  projectService.getProjects();

        HttpStatus status = projects.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(projects, status);
    }

    @PostMapping()
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto projectDto) {
        var project =  projectService.createProject(projectDto);

        HttpStatus status = project == null ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(project, status);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
