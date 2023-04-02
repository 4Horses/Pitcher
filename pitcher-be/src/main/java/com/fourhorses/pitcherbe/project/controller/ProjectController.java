package com.fourhorses.pitcherbe.project.controller;

import com.fourhorses.pitcherbe.project.dto.ProjectDto;
import com.fourhorses.pitcherbe.project.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
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

    @Operation(summary = "Get all projects")
    @GetMapping()
    public ResponseEntity<List<ProjectDto>> getProjects() {
        var projects =  projectService.getProjects();

        HttpStatus status = projects.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(projects, status);
    }

    @Operation(summary = "Get a project by id")
    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto> getProjectById(@PathVariable Long id) {
        var project =  projectService.getProjectById(id);

        HttpStatus status = project == null ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(project, status);
    }

    @Operation(summary = "Create a new project")
    @PostMapping()
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto projectDto) {
        var project =  projectService.createProject(projectDto);

        HttpStatus status = project == null ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(project, status);
    }

    @Operation(summary = "Delete a project")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "Get all projects by category id")
    @GetMapping("/category/{id}")
    public ResponseEntity<List<ProjectDto>> getProjectsByCategoryId(@PathVariable Long id) {
        var projects =  projectService.getProjectsByCategoryId(id);

        HttpStatus status = projects.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(projects, status);
    }
}
