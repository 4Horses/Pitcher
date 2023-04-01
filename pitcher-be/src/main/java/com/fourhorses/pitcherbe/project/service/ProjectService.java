package com.fourhorses.pitcherbe.project.service;

import com.fourhorses.pitcherbe.project.dto.ProjectDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getProjects();

    ProjectDto createProject(ProjectDto projectDto);

    void deleteProject(Long id);

    Long countPitchedProjectsByUserId(Long userId);

    Long countCompletedProjectsByUserId(Long userId);

    Long countSponsoredProjectsByAccountId(Long accountId);

    Long countCreatedProjectsByUserId(Long userId);
}
