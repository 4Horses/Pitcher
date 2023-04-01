package com.fourhorses.pitcherbe.project.service;

import com.fourhorses.pitcherbe.category.service.CategoryService;
import com.fourhorses.pitcherbe.project.dto.ProjectDto;
import com.fourhorses.pitcherbe.project.entity.ProjectEntity;
import com.fourhorses.pitcherbe.project.repository.ProjectRepository;
import com.fourhorses.pitcherbe.user_account.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    private final CategoryService categoryService;
    private final UserAccountService userAccountService;
    private final ModelMapper modelMapper;
    private final Clock clock;

    @Override
    public List<ProjectDto> getProjects() {
        var projects = projectRepository.findAll();

        return modelMapper.map(projects, new TypeToken<List<ProjectDto>>() {
        }.getType());
    }

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {
        ProjectEntity projectEntity = ProjectEntity.builder()
                .createdAt(LocalDateTime.now(clock))
                .startDate(projectDto.getStartDate())
                .endDate(projectDto.getEndDate())
                .name(projectDto.getName())
                .description(projectDto.getDescription())
                .category(categoryService.getCategoryEntityById(projectDto.getCategoryId()))
                .userAccount(userAccountService.getUserAccountEntityById(projectDto.getUserAccountId()))
                .build();

        var savedProject = projectRepository.save(projectEntity);
        return modelMapper.map(savedProject, ProjectDto.class);
    }
}
