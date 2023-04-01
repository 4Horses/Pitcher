package com.fourhorses.pitcherbe.project.service;

import com.fourhorses.pitcherbe.category.service.CategoryService;
import com.fourhorses.pitcherbe.project.dto.ProjectDto;
import com.fourhorses.pitcherbe.project.entity.ProjectEntity;
import com.fourhorses.pitcherbe.project.repository.ProjectRepository;
import com.fourhorses.pitcherbe.user_account.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
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
        log.info("Getting all projects");
        var projects = projectRepository.findAllByIsDeletedFalse();

        return modelMapper.map(projects, new TypeToken<List<ProjectDto>>() {
        }.getType());
    }

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {
        log.info("Creating project {}", projectDto);
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

    @Override
    public void deleteProject(Long id) {
        log.info("Deleting project with id {}", id);
        var project = projectRepository.findById(id).orElseThrow();
        project.setIsDeleted(true);
        projectRepository.save(project);
    }

    @Override
    public Long countPitchedProjectsByUserId(Long userId) {
        log.info("Counting pitched projects by user id {}", userId);
        return projectRepository.countPitchedProjects(userId);
    }

    @Override
    public Long countCompletedProjectsByUserId(Long userId) {
        log.info("Counting completed projects by user id {}", userId);
        return projectRepository.countCompletedProjects(userId);
    }

    @Override
    public Long countSponsoredProjectsByAccountId(Long accountId) {
        log.info("Counting sponsored projects by account id {}", accountId);
        return projectRepository.countSponsoredProjects(accountId);
    }

    @Override
    public Long countCreatedProjectsByUserId(Long userId) {
        log.info("Counting created projects by user id {}", userId);
        return projectRepository.countByUserAccountIdAndIsDeletedFalse(userId);
    }
}
