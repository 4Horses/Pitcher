package com.fourhorses.pitcherbe.badge.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BadgeDto {
    private Long profileCompletion;
    private Long pitchedProjects;
    private Long completedProjects;
    private Long sponsoredProjects;
    private Long createdProjects;

}
