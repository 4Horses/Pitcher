package com.fourhorses.pitcherbe.project.service;

import com.fourhorses.pitcherbe.common.exception.BadRequestException;
import com.fourhorses.pitcherbe.organization_account.dto.OrganizationAccountDto;
import com.fourhorses.pitcherbe.project.dto.ProjectDto;
import com.fourhorses.pitcherbe.project.entity.ProjectEntity;
import com.fourhorses.pitcherbe.user_account.dto.UserAccountDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getProjects();

    ProjectDto createProject(ProjectDto projectDto);

    ProjectEntity getProjectEntityById(Long id);

    void deleteProject(Long id);

    Long countPitchedProjectsByUserId(Long userId);

    Long countCompletedProjectsByUserId(Long userId);

    Long countSponsoredProjectsByAccountId(Long accountId);

    Long countCreatedProjectsByUserId(Long userId);

    List<UserAccountDto> getParticipants(Long projectId);

    UserAccountDto addParticipant(Long projectId, UserAccountDto userAccountDto) throws BadRequestException;

    void removeParticipant(Long projectId, UserAccountDto userAccountDto) throws BadRequestException;

    List<OrganizationAccountDto> getSponsors(Long projectId);

    OrganizationAccountDto addSponsor(Long projectId, OrganizationAccountDto organizationAccountDto) throws BadRequestException;

    void removeSponsor(Long projectId, OrganizationAccountDto organizationAccountDto) throws BadRequestException;

    List<ProjectDto> getProjectsByCategoryId(Long categoryId);

    ProjectDto getProjectById(Long userId);
}
