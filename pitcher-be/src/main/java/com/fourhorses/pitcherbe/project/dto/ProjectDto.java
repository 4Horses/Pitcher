package com.fourhorses.pitcherbe.project.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProjectDto {
    private Long id;
    private String name;
    private String description;
    private Long categoryId;
    private Long userAccountId;
    private LocalDateTime createdAt;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean isFinished;
}
