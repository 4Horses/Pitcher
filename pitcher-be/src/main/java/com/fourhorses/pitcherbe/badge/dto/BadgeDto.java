package com.fourhorses.pitcherbe.badge.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BadgeDto {
    private Long profileCompletion;
    private Long pitchedProjects;
    private Long completedProjects;
    private Long sponsoredProjects;
    private Long createdProjects;
    private List<CategoryFrequencyDto> categoryFrequency;
}
