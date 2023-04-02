package com.fourhorses.pitcherbe.badge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BadgeDto {
    private Long profileCompletion;
    private Long pitchedProjects;
    private Long completedProjects;
    private Long sponsoredProjects;
    private Long createdProjects;
    private List<CategoryFrequencyDto> categoryFrequency;
}
