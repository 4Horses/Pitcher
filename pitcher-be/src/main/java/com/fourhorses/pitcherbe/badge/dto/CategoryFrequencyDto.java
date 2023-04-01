package com.fourhorses.pitcherbe.badge.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryFrequencyDto {
    private Long categoryId;
    private Long frequency;
}
