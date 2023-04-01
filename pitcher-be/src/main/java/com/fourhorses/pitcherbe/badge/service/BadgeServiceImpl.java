package com.fourhorses.pitcherbe.badge.service;

import com.fourhorses.pitcherbe.badge.dto.BadgeDto;
import com.fourhorses.pitcherbe.category.service.CategoryService;
import com.fourhorses.pitcherbe.project.service.ProjectService;
import com.fourhorses.pitcherbe.user_account.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BadgeServiceImpl implements BadgeService {
    private final CategoryService categoryService;
    private final ProjectService projectService;
    private final UserAccountService userAccountService;

    @Override
    public BadgeDto getBadgeUserById(Long id) {
        log.info("Request to get badge user by id: {}", id);
        return BadgeDto.builder()
                .profileCompletion(userAccountService.countUserAccountProfileCompletion(id))
                .pitchedProjects(projectService.countPitchedProjectsByUserId(id))
                .completedProjects(projectService.countCompletedProjectsByUserId(id))
                .sponsoredProjects(projectService.countSponsoredProjectsByAccountId(id))
                .createdProjects(projectService.countCreatedProjectsByUserId(id))
                .build();
    }
}
